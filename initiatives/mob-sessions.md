> Looking for more resources? See [Clojure Camp Handbook](/README.md)

# 👨🏻‍💻 Mob-Programming Sessions

Try to solve some exercises all together as a mob. Very accessible to new Clojure programmers.

See https://www.meetup.com/clojure-camp/ and events in [Discord](discord.md) for scheduled events.

## Students

- RSVP via meetup.com, and show up
- (no need to have anything set up on your computer)
- What to expect:
  - A bunch of learners on a remote call
  - A facilitator
  - Access to a shared screen-sharing session
  - Work step-by-step through a few simple exercises together, taking turns driving
    - (exercises usually chosen by the facilitator)

## Mentors

See [Mob Facilitator Guide](../pedagogy/mob-facilitator-guide.md) for more details



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
    - IMO (Raf), the sharing functionality doesn’t capture 100% of the experience, evaling is awkward, also, requires more set-up for the student
  - Why not Zoom?
    - The control latency is better when everyone connects to a remote server than to a mentor’s local computer

## Stewards

-

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
