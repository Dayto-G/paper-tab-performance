# Tab Performance

A simple Paper server plugin that shows **TPS and MSPT in the Tab player list**. Keep an eye on server performance without typing a command.

```text
TPS: 20.0  |  MSPT: 12.4
```

## Features

- Shows one-minute TPS and average milliseconds per tick (MSPT) in the player list footer.
- Updates every 20 server ticks (about once per second at 20 TPS).
- Uses green, yellow and red to make performance changes easy to spot.
- No commands or configuration required.

A good fit for Paper server owners who want a quick performance indicator visible to everyone. TPS is a one-minute average, so it may not immediately reflect a sudden lag spike.

## Requirements

- Paper 26.3
- Java 25

## Installation

1. Download the JAR under **Assets** from [the latest release](https://github.com/Dayto-G/paper-tab-performance/releases/latest).
2. Put it in your server's `plugins` folder.
3. Restart the server, join, and press **Tab**.

The plugin controls the player list footer. Other plugins that also control the footer may overwrite it or conflict with it.

## Understanding the numbers

- **TPS (ticks per second):** Paper's one-minute average, capped at 20 in the display. Closer to 20 is better. Green: 18 or above; yellow: 15 to below 18; red: below 15.
- **MSPT (milliseconds per tick):** Paper's average tick time. Lower is better. Green: below 40; yellow: 40 to below 50; red: 50 or above.

## Build from source

Install Java 25 and Gradle, then run `gradle build`. The JAR will be in `build/libs/`.
