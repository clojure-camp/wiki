# Mob Facilitator Guide

## Before the Event

Start at least 10 min before the event is scheduled to start.

1. **Think of an exercise to do**
   - Advent of Code Day 1-3 is a good default
   - want it to be clear/unambigous (to avoid wasting time on defining the scope)

2. **Spin up the server**
   - via mob manager
   - choose location based on the event time zone (US, Europe, etc.)
   - it takes ~5min for server to provision and boot

3. **Once server is up:**
   - connect to https://mob.clojure.camp
   - open up VsCode
   - create new namespace
   - start up the REPL
   - test evaluation
   - write: `;; who's here?` near top of file

## The Event

1. **Welcome**
   - welcome regulars by name
   - ask new members for introductions
      - what name to call them?
         - (update their nickname in Discord for them)
      - where from?
      - what clojure experience so far
         - (maybe: what most complicated)
         - (maybe: what other programming experience)

2. **Explain the Plan**
   - connect to a shared server
   - introduce problem
   - discuss plan on how to approach problem
   - code it mob style: taking 3 min each

3. **Share Connection Details**
   ```
   server: https://mob.clojure.camp
   username: clojodojo
   password: clojodojo
   ```

4. **Ask participants to enter their name under "who's here"**
   - wait until everyone has done it

5. **Introduce the Problem**
   - before moving on, ask: "any questions about the problem?"

6. **Discuss the Problem**
   - open-ended discussion about how to approach the problem
   - as facilitator, take notes in the editor
   - can prompt: "how would you approach this in another language?"
   - if people didn't contribute, ask them to share their thoughts

7. **Pick and Approach**
   - as facilitator, pick an approach
   - reexplain it
   - ask: "any questions about the approach?"

8. **explain how the mob coding will work:**
   - 3 minute turns
     - do whatever you want to
     - can use your turn to ask questions
     - can skip
     - avoid giving help unless asked for
     - leave questions for your turn
   - how to use UI
     - ctrl-s (save file, evaluates the entire file)
     - alt-enter (option-enter) (evaluates the current root form)

9. **Mob Coding**
   - run the mob coding
   - advice for facilitators:
     - at beginning, clean up list of names at the top of the file
       - this will be the order for the mobbing
       - write down the order for yourself (on paper)
     - don't have to pre-explain concepts, allow people to ask questions when they need
     - try to maintain flow (going on long asides disrupts everyone's flow)
     - avoid interrupting someone during their turn
       - if you need, wait until their turn is done
     - timing:
        - 3 minutes + flex time
        - give more time when...
          - lots of conversation (by other people)
          - technical difficulties
          - not making too much progress
        - ok to cut off someone in the middle of doing something
          - (can be good, because the next person can easily pick up where they left off)
        - avoid "timer pressure" phrases
          - ❌ "I'm starting the timer"
          - ❌ "you have 30 seconds left"
        - use welcoming language
          - avoid idioms, jokes, jargon
          - don't pit people against each other
          - avoid judgement
              - ❌ "just..."
              - ❌ "woof, you left a steaming pile of garbage for the next person"

10. **Wrapping Up**
   - thank participants
   - mention when next events are
   - mention that code will be posted in the Discord

## After the Event

1. **End the Discord event**

2. **Copy code out of editor, share in Discord (general chat)**

3. **Shut Down OS** (from the desktop)

4. **Destroy Instance** (via the mob manager)

---

## Old Notes

- to run your own
  - pop-by an event to see how it’s run
  - schedule a meet w/ Raf to get a run-through of the tooling
- advice:
  - before
    - choose a problem from the [Exercise Library](/initiatives/exercise-library.md) or a Day 1-3 Advent-of-Code problem
    - spin up the server 5 min before the session starts
    - open up VS Code and the REPL
  - during
    - share server details, make sure everyone can see
    - introduce the problem
    - introduce how the REPL experience works
      - `Ctrl - Enter`
      - `Alt - Enter`
      - `Ctrl - S` (save file, and re-evaluate)
      - hyperfiddle.rpl tests
      - using #\_
      - parinfer
      - remind of clojuredocs
    - ask for high-level approaches to a problem
      - or even, like, “how would you do this in the language your are most comfortable with?”
      - take note of multiple approaches
    - work through the various approaches
      - have most of the typing be done by the participants
      - change who writes frequently (after every milestone), typically 3 min, max 5 min
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
        - suggest modifications to the function
    - after
      - shutdown
      - rename disk, and imagify
      - (wait)
      - destroy server