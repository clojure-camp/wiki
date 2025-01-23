> Looking for more resources? See [Clojure Camp Handbook](README.md)

# 👨🏻‍💻 Mob-Programming Sessions

Try to solve some exercises all together as a mob. Very accessible to new Clojure programmers.

See https://www.meetup.com/clojure-camp/ for scheduled events.

## Students

- RSVP via meetup.com, and show up
- (no need to have anything set up on your computer)
- What to expect:
  - A bunch of learners on a remote call
  - One or two mentor facilitators
  - Access to a shared screen-sharing session
  - Work step-by-step through a few simple exercises together, taking turns driving
    - (exercises usually chosen by the facilitator)

## Mentors

- to run your own
  - pop-by an event to see how it’s run
  - schedule a meet w/ [Raf](mentors.md) to get a run through of the tooling
- advice:
  - before
    - choose a problem from [Exercise Site](exercise.md) or an Day 1-3 Advent-of-Code
    - spin up the server 5 min before the session starts
    - open up VS Code and the REPL
  - during
    - share server details, make sure everyone can see
    - introduce the problem
    - introduce how the REPL experience works
      - Ctrl - Enter
      - Alt - Enter
      - Ctrl - S (save file, and re-evaluate)
      - hyperfiddle.rpl tests
      - using #\_
      - parinfer
      - remind of clojuredocs
    - ask for high-level approaches to a problem
      - or even, like, “how would you do this in the language your are most comfortable with?”
      - take note of multiple approaches
    - work through the various approaches
      - have most of the typing be done by students
      - change who writes frequently (after every milestone), max 5 min
      - advise on good REPL workflow
        - lots of evaluating forms to see the output
        - ex. writing small snippets, evaluating, then re-integrating into the bigger solution
        - if asked, “what does fn X do with input Y?”
          - “just try it in the REPL!”
      - suggest refactors after a function is done
      - suggest alternative functions
        - but have students do the refactor
        - open up clojuredocs for the new function
      - (if have time)
        - suggest modifications to fn
    - after
      - shutdown
      - rename disk, and imagify
      - (wait)
      - destroy server
- Tooling notes
  - Overview
    - We spin up a beefy VPS on-demand for each session, based on an pre-made disk image. Students connect to a VNC session via the browser (nothing to install).
  - Using:
    - Guacamole (https://guacamole.apache.org/)
      - For the in-browser VNC experience
    - Linode
      - for the VPS
        - (could use other, but Linode had a one-click-setup)
          - https://www.linode.com/marketplace/apps/linode/apache-guacamole/
    - Debian
      - (b/c that’s what was in the set-up script)
    - VS Code + Calva + Parinfer
      - for the code editor
    - Jitsi
      - for the audio/video call
      - can also use Discord, etc.
  - Why spin-up-and-shut-down each time?
    - Let’s us run a beefy VPS, but only pay ~$1/session, rather than $360/mth
  - Why not VS Code in-built sharing?
    - IMO ([Raf](mentors.md)), the sharing functionality doesn’t capture 100% of the experience, evaling is awkward, also, requires more set-up for the student
  - Why not Zoom?
    - The control latency is better when everyone connects to a remote server than to a mentor’s local computer

## Stewards

- See [Mob Facilitator Guide](mob-facilitator-guide.md) for more details

- Wishlist
  - an app
    - mentor logs in, does the spin-up, shut-down
      - ie. no direct linode access needed
    - wires up domain to IP address
      - ie. can share a nice link to students w/ SSL
        - ex. mob.clojure.camp
    - auto-shut down after 3 hours
  - modify guacamole for better UX
    - students and admins
    - student can request control, admin approves
    - one student controls at a time
