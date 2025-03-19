> Looking for more resources? See [Clojure Camp Handbook](/README.md)

# Using LLMs for Learning

## Should I use an LLM (ChatGPT, etc.) for learning?

Yes, LLMs can be a great educational resource. We recommend using them to learn. It isn't "cheating".

An LLM is an infinitely patient mentor, that can answer your exact questions at any time. LLMs can help fill in the blanks while you're learning, **if you use them right**.

LLMs are like calculators:
  - good: help you do a square root quickly
  - bad: don't tell you that there are two possible answers (ie. understanding your tools is important)

See also [Clojure Camp’s stance on AI Tools and Education](/pedagogy/gptpolicy.md)

## How should I make use of LLM tools?

To leverage LLMs for learning means going beyond using LLMs as just "code generators":

  - as a search engine for appropriate functions
    - “I’d like to do convert a vector of strings to integers in Clojure, what function might I use to do that?”
  - code generation
    - “In Clojure, write a function that…”
    - (if you don't know how to solve a problem, it's ok to use an LLM, then try to understand it; "learning to read" is a step towards "learning to write") 
  - explain code snippet
    - “What does this code do…”
  - explain a concept
    - "What is an http server?"
  - code review
    - "Code review the following. Recommend potential refactors, particularly to make it more idiomatic..."
  - create a quiz
    - ex. “You are a computer science expert teaching "Introduction to Clojure" using Clojure for the Brave and True as the course textbook (https://www.braveclojure.com/). Create a quiz to help me determine whether I have mastered Chapter 3, "Do Things" ( https://www.braveclojure.com/do-things/ ).”


## What LLM tool should I use?

- Chat-Style Interface
  - [ChatGPT](https://chatgpt.com/) 
  - [Claude](https://claude.ai/)

- Editor Integration (autocomplete, select-code-and-prompt)
  - [Github Copilot](https://github.com/copilot)
  - [Cursor](https://cursor.com) 

- Advice...
  - when using the chat-style interfaces, start a new conversation for each new major question
  
- Common issues...
  - make up functions that don’t exist (ex. `clojure.core/transpose`)
  - mismatch brackets
  - straight up give wrong answers
    - (”Q: What is nil punning? A: Making a pun about nil values.”)
