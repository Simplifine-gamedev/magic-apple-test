# Magic Apple

A Minecraft Fabric mod that adds a magical apple item with special powers!

## Description

This mod introduces the **Magic Apple** - a special food item that grants the player Speed II effect for 30 seconds when consumed. Perfect for quick getaways, exploration, or just zooming around your world!

## Features

- **Magic Apple Item** - A new consumable item
- **Speed II Effect** - Grants 30 seconds of Speed II when eaten
- **Always Edible** - Can be eaten even when hunger bar is full
- **Nutritious** - Provides 4 hunger points (2 drumsticks) and 1.2 saturation

## How to Use

1. Obtain a Magic Apple:
   - Use the command: `/give @p magic-apple-test:magic_apple`
   - Or add to recipes/loot tables in your modpack

2. Eat the Magic Apple to receive Speed II for 30 seconds

## Installation

### Requirements
- Minecraft 1.21.1
- Fabric Loader 0.16.0 or higher
- Fabric API

### Install Steps
1. Install Fabric Loader for Minecraft 1.21.1
2. Download Fabric API and place in your `mods` folder
3. Download `magic-apple-test-1.0.0.jar` from the releases
4. Place the jar file in your `mods` folder
5. Launch Minecraft with the Fabric profile

## Building from Source

```bash
git clone https://github.com/Simplifine-gamedev/magic-apple-test.git
cd magic-apple-test
./gradlew build
```

The compiled jar will be in `build/libs/`

## Technical Details

- Mod ID: `magic-apple-test`
- Item ID: `magic-apple-test:magic_apple`
- Effect: Speed II (amplifier 1) for 600 ticks (30 seconds)
- Food Component: 4 nutrition, 1.2 saturation, always edible

## License

Feel free to use this mod in modpacks and servers.

## Author

Created by ali77sina
