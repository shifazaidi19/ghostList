# GhostList – Self-Erasing To-Do List 👻

## Overview
GhostList is a self-erasing to-do list application built in Java. It lets users add tasks that automatically disappear after a set time, which in this version is 15 seconds. This keeps the list clean and promotes quick task completion. This project shows how to use Java's `ArrayList`, `Timer`, and `Scanner` for managing tasks and user input.

## Inspiration
I came up with the idea for GhostList from the challenge of managing overwhelming to-do lists. Often, people add tasks but forget or ignore them, leading to a cluttered list. I wanted to design a simple and enjoyable app that encourages productivity while keeping the interface neat. Tasks appear and then vanish like a “ghost.”

> "Tasks appear, then disappear. GhostList makes them fade, my dear."

## Key Learnings
While building GhostList, I learned:

- **Java fundamentals**: Effectively working with `ArrayList`, loops, and conditionals.  
- **Timers and scheduling**: Using `Timer` and `TimerTask` to schedule actions.  
- **User input handling**: Managing `Scanner` inputs while avoiding newline and type mismatch issues.  
- **Debugging asynchronous behavior**: Making sure tasks were removed correctly without impacting others.

## Implementation
- **Core Structure:** I used `ArrayList<String>` to store tasks.  
- **Input Handling:** Captured user inputs via `Scanner` for an interactive console interface.  
- **Auto-Delete Feature:** Implemented `Timer` and `TimerTask` to remove tasks automatically after 15 seconds.  
- **Task Management:** Safely removed tasks using references to prevent index-related errors.  

Mathematically, the auto-delete timing can be represented as:  

$$
t_{delete} = 15 \text{ seconds}
$$

## Challenges Faced
- Handling asynchronous task deletion without crashing the program.  
- Ensuring users could see tasks before they vanished.  
- Managing `Scanner` input errors, especially when mixing `nextInt()` and `nextLine()`.  
- Keeping the program simple but still interactive and functional.

## Future Improvements
- Customizable timers for different tasks.  
- GUI version for a more interactive experience.  
- Temporary task storage in a database or file before auto-deletion.  
- Notifications before task deletion for better user engagement.

## Conclusion
GhostList taught me how to combine basic Java features with problem-solving skills. The idea of tasks showing up and disappearing gives a unique, gamified approach to task management.
