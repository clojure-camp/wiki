> Looking for more resources? See [Clojure Camp Handbook](README.md)

# Learning “Programmatic Problem Solving”

If Clojure is your first programming language, you’re not only learning Clojure, but “how to program in general”.

- “learning to program” consists largely of:
  - developing a mental model of how the “virtual machine” works
    - ie. how Clojure+JVM evaluates your code
  - building your “toolkit”
    - functions (and higher-level patterns) you know how to use
  - learning to “convert word problems” to code, break problems down into smaller problems, and debug
- programming, then, becomes:

  - understanding what the “virtual machine” can do, and applying the various things a language provides to control it, in order to make it do you want it to do

- Raf’s gentle introduce to “what is programming even?" (very WIP)

  - https://cognitory.github.io/introduction-to-programming/

- when solving a problem, “do what you know”, and “mock out” code that you don’t

  - if you can break down a problem into “part that I know” and “part that I don’t know how to do”, you can implement “part that I know” and make up a function that does “what you don’t know” (and later figure out how to implement it)

- a “proper” debugging process is important
  - improper: willy-nilly modifying some code to see if it fixes things
  - proper:
    - understanding why the code as is is doing what it is doing (throwing an error, giving a wrong result)
      - narrowing down via “print statement debugging” (or using `tap`) or a debugger
- “programming in practice” is a infinite rabbit hole, because there are very many different systems to learn (ie. just learning Clojure lets you program command-line apps, but, to learn web, you need to learn how browser “virtual machines” work)
