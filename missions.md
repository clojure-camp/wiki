> Looking for more resources? See [Clojure Camp Handbook](/README.md)

# Missions

Missions are open tasks for Campers to work on to improve our community.

To take on a Mission, message \_rafd on Discord.

## Active Missions

- function of the day (mycc) @austin-meier

  - allow users to subscribe to a daily "function of the day" email

- faded problems (exercise library) @cantwellnc + @taulant

  - create a script that generates "[faded](https://teachtogether.tech/en/index.html#faded-examples)" variations of our exercises
  - modify our exercise app to allow user to set a level of fading

- misc mycc tweaks @oleh-sedletskyi

  - in match email, indicate when it's a user's first time
  - improve topics stats display (now that we have skill-levels per topic)
  - show overall availability in the p2p calendar availability-view
 
- clojure camp TIL @Epidiah
  
  - app for posting today-i-learned posts


## Open Missions

- mob programming sessions
  - set up script
    - create a Docker, Ansible or Babashka script so that any mentor can trivially spin up a mob session VM
      - Debian/Ubuntu + Apache Guacamole + Clojure + VS Code + Calva
  - translate CMD to Ctrl
  - no password

- mycc - pairing scheduler
  - integrate w/ google calendar (auto-remove availability when something is scheduled)
  - also schedule 3+ person mob events (on a single topic)
    - would want some way to opt-in/out of mob events
  - notify on matches on discord
    - currently, we send an email with pairings; we would also like to send a Discord message
  - reminders on discord
    - send an email 10 min before each pairing event to the participants

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

## Ideas

These aren't well defined yet.

- a simplified version of Flowstorm interface appropriate for total beginners to understand how Clojure parses code
- integrating Flowstorm into VSCode/calva
- a simplified version of VSCode that comes preconfigured for Clojure (calva, etc.) and nothing else
- a coding game where you have to re-implement clojure functions to "earn" the right to use them (and upgrade the IDE) 

## Past Missions

Thank you to Campers for completing these missions!

- 2025-02 @oleh-sedletskyi (and @rafd)
  - mob-controller - create tool to automate steps to start and shutdown the mob server
- 2024-12 @oleh-sedletskyi (and @rafd)
  - mycc - restructure to match based on per-topic skill level (rather than overall learner/mentor status)
- 2024-11 @afucher
  - exercises - add support for i18n
  - exercises - add pt-BR translations
- 2024-11 @taulant
  - website - transition to clj
  - handbook - transition to github wiki
- 2024-09 @oleh-sedletskyi (and @rafd)
  - mycc - merge in pairing algo repo into the main repo
  - mycc - use language preferences when matching
  - mycc - improve pairing algorithm stop condition
- 2024-02 @the-dress-code (and @rafd)
  - mycc - allow users to indicate mentor vs peer pairing preference
- 2024-02 @matheusfrancisco (and @rafd)
  - mycc - migration scripts
- 2024-02 @J0sueTM (and @rafd)
  - mycc - timezone dropdown
- 2023-12 @austin-meier
  - mycc - improve backend validation
- 2023-06 @recia-r
  - mycc - add weekend option to pairing schedule
- 2023-04 @nikijiandani
  - mycc - visual improvements (align schedule hour to top of row)
- 2021-04 @asukakuwahara (and @rafd)
  - mycc - add max-pair-per-day and -per-week options
- 2020-2023 @Don-Stevenson @nikijiandani @dbeattie (and @rafd)
  - mycc - many sessions of pairing with @rafd to build the app
- 2020-06 @icncsx (and @rafd)
  - mycc - initial draft of pairing algorithm
