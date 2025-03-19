#!/usr/bin/env bb

(require '[babashka.fs :as fs])
(require '[clojure.string :as str])

(defn extract-links
  [file-path]
  (-> file-path
      fs/file
      slurp
      (str/split #"\n")
      (->> (map-indexed (fn [index line]
                          (->> (re-seq #"\[.*?\]\((.*?)(?: \".*?\")?\)" line)
                               (map (fn [match]
                                         {:link/source file-path
                                          :link/line index
                                          :link/target (second match)})))))
           (apply concat))))

#_(extract-links "README.md")

(defn file-exists?
  [file-path source-dir root-dir]
  (let [path (if (str/starts-with? file-path "/")
               (fs/file root-dir (subs file-path 1))
               (fs/file (fs/parent source-dir) file-path))]
    (fs/exists? path)))

(defn valid-link?
  [root-dir {:link/keys [source target]}]
  (cond
    ;; ignore anchor links
    (str/starts-with? target "#")
    true

    ;; ignore absolute URLs
    (str/starts-with? target "http")
    true

    ;; check relative file paths
    :else
    (file-exists? target source root-dir)))

#_(valid-link? "." {:link/target "http://www.example.com"})
#_(valid-link? "." {:link/target "#foo"})

(defn broken-links
  [root-dir file]
  (->> file
       extract-links
       (remove (partial valid-link? root-dir))))

#_(broken-links (fs/canonicalize ".")
                "README.md")

(defn report
  [dir]
  (let [root-dir (fs/canonicalize dir)
        _ (println "Checking" (str root-dir) "for broken links.")
        files (fs/glob dir "**.md")
        _ (println "Found" (count files) "markdown files...")]
    (doseq [file files]
      (let [links (broken-links root-dir file)]
        (when (seq links)
          (println (str file)))
        (doseq [{:link/keys [line target]} links]
          (println (format "  %03d  %s" line target)))))))

#_(report ".")

(defn -main
  [& args]
  (report (or (first args) ".")))

(when (= *file* (System/getProperty "babashka.file"))
  (apply -main *command-line-args*))
