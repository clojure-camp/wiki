# Missions

Missions are open tasks for Campers to work on to improve our community.

To take on a Mission, message _rafd on Discord.

## In Progress

- function of the day (mycc) @austin-meier
	- allow users to subscribe to a daily "function of the day" email

- faded problems (exercise library) @cantwellnc
	- create a script that generates "[faded](https://teachtogether.tech/en/index.html#faded-examples)" variations of our exercises
	- modify our exercise app to allow user to set a level of fading

- internationalizing exercises (exercise library) @afucher
	- add i18n support for our exercises (starting with adding Pt-Br) 

## Open
 	
- mob programming sessions
    - set up script
    	- create a Docker, Ansible or Babashka script so that any mentor can trivially spin up a mob session VM
    		- Debian/Ubuntu + Apache Guacamole + Clojure + VS Code + Calva
- website
    - website transition to clj
    	- convert website to hiccup + a script for gh pages to generate it statically
- handbook
    - transition from notion to github
      - transfer handbook content to wiki repo
      - + a script to generate a static site from the repo 
- mycc - pairing scheduler
    - per-topic skill level
       - currently, people mark themselves as "learner" or "mentor", and select various topics
       - we want to transition to:
          - for each topic, someone can select: beginner / intermediate / expert
      - also, modify the pairing algorithm to take this information into account
    - notify on matches on discord
       - currently, we send an email with pairings; we would also like to send a Discord message
    - reminders on discord
       - send an email 10 min before each pairing event to the participants
    - pop.com integration
       - investigate if we can create pop.com "meetings" for each pairing session
- mycc - events
    - centralized events infra
       - a centralized place for all Clojure Camp events
       - ability for Campers to submit and modify events
       - internally, display Meetup.com events and Discord events (to see what is missing)
    - participation tracking
       - way for admins to mark who attended what event (or attendees to self mark)
    - weekly post of events on discord
       - script to: once a week, post a message on Discord with list of events
- topic map
    - resource input ux
       - UI to add resources and link them to learning objectives
    - badges
      - way for Campers to earn badges for different topic mastery (more though needs to be put into it)


## Past Missions

Thank you to Campers for completing these missions!

- 2024-09 @oleh-sedletskyi 
  - mycc - merge in pairing algo repo into the main repo
  - mycc - use language preferences when matching
  - mycc - improve pairing algorithm stop condition
- 2024-02 @the-dress-code
  - mycc - allow users to indicate mentor vs peer pairing preference
- 2024-02 @matheusfrancisco
  - mycc - migration scripts
- 2024-02 @J0sueTM
  - mycc - timezone dropdown
- 2023-12 @austin-meier
  - mycc - improve backend validation
- 2023-06 @recia-r
  - mycc - add weekend option to pairing schedule
- 2023-04 @nikijiandani
  - mycc - visual improvements (align schedule hour to top of row)
- 2021-04 @asukakuwahara
  - mycc - add max-pair-per-day and -per-week options
- 2020-2023 @Don-Stevenson @nikijiandani @dbeattie
  - mycc - many sessions of pairing with @rafd to build the app
- 2020-06 @icncsx
  - mycc - initial draft of pairing algorithm
