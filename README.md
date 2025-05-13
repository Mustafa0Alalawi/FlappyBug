# FlappyBug 🐞

A simplified Flappy Bird-style game implemented in **Scala**. The game logic is driven by a `Game` object that manages the overall state — including a single bug and a single obstacle — and updates them as time passes.

## Overview

FlappyBug is a minimal arcade game simulation where:
- A **bug** must navigate past **obstacles**.
- The game updates dynamically as time passes.
- The player controls the bug by making it "flap" to avoid falling or crashing.

### Core Logic

- The `Game` object represents the current state of play.
- It holds references to:
  - A **Bug** object (the player character)
  - An **Obstacle** object (the challenge to overcome)
- It handles:
  - Physics (falling motion of the bug)
  - Movement (obstacles moving toward the bug)
  - Game progression and updates over time

## Features

- Bug falls automatically due to simulated gravity
- Obstacles move across the screen toward the bug
- Simple collision and game-over logic
- Clean, object-oriented design in Scala

## Installation & Running

Ensure you have [Scala](https://www.scala-lang.org/download/) and [SBT](https://www.scala-sbt.org/) installed.

### Clone and run:

```bash
git clone https://github.com/Mustafa0Alalawi/FlappyBug.git
cd FlappyBug
sbt run
```

## Demo

<img width="1000" alt="image" src="https://github.com/user-attachments/assets/e5cd79f1-8408-4a54-850d-eeb3e8587f95" />
