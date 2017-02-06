package net.slipcor.pvparena.api;

import org.bukkit.configuration.file.YamlConfiguration;

public interface IArenaPlayerState {
    /**
     * Clear player state variables
     */
    void clear();

    /**
     * Read player state from a file
     * @param cfg the YAML configuration to read
     * @param name the player name to read
     * @return the player state
     */
    IArenaPlayerState readDump(final YamlConfiguration cfg, final String name);

    /**
     * Save the player state to a file
     * @param cfg the YAML configuration to read
     */
    void saveDump(final YamlConfiguration cfg);
}
