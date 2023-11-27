# DamageTP Plugin
DamageTP is a Spigot plugin that introduces a unique gameplay mechanic - whenever a player takes damage, they will be randomly teleported within the world. This plugin adds an element of surprise and challenge to gameplay by offering a random teleportation feature upon player damage.

## Features:
Random Teleportation: Players are teleported to a random location within the world upon taking damage.

Configurability: The plugin settings can be adjusted to suit different server environments and preferences.

World Border Limit: Option to set limits for how far players can teleport from their original location, providing control over teleportation distances.

## Installation
Download the latest plugin JAR file from the releases page.
Place the downloaded JAR file into the plugins folder of your Spigot server.
Start or restart your Spigot server.

## Configuration
The plugin's behavior can be modified through the config.yml file located in the plugin's folder. Here are the configurable options:

```yaml
# True if you want to limit how far it teleports players
world-border: true

# How many blocks away they CAN spawn (not will)
border: 200
# If no world border, the limit is automatically set to 25,000 blocks
world-border: Set this to true if you wish to limit the distance players can teleport from their original location using the world border.
border: Specifies the maximum number of blocks away a player can spawn (if world-border is enabled). If there's no world border set, the limit is automatically set to 25,000 blocks.
```

## Usage
Once the plugin is installed and configured, it will automatically activate the random teleportation feature upon a player receiving damage in the game.

## Contributing
Contributions to this plugin are welcome! Feel free to fork this repository, make changes, and submit pull requests.

## Issues
If you encounter any problems or would like to suggest improvements, please create an issue in the issue tracker.

## License
This plugin is released under the MIT License. You are free to modify and distribute the plugin as per the terms of the license.

