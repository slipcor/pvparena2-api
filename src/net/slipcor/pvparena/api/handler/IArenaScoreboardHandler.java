package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.IArenaTeam;
import net.slipcor.pvparena.api.loadables.IArenaModule;
import org.bukkit.entity.Player;

public interface IArenaScoreboardHandler {
    /**
     * Add a custom scoreboard entry
     *
     * @param module the setting module - can be null
     * @param entry the entry to set
     * @param value the score value to set it to
     * @return true if successful, false otherwise
     */
    boolean addCustomScoreBoardEntry(final IArenaModule module, final String entry, final int value);

    /**
     * Remove a custom scoreboard entry
     *
     * @param module the setting module - can be null
     * @param value the score value to remove
     * @return true if successful, false otherwise
     */
    boolean removeCustomScoreBoardEntry(final IArenaModule module, final int value);

    /**
     * Refresh all scoreboards
     */
    void updateScoreboards();

    /**
     * Change a player's scoreboard team based on an arena team change
     *
     * @param player the player to change
     * @param oldTeam the old team
     * @param newTeam the new team
     */
    void updateScoreboardTeam(final Player player, final IArenaTeam oldTeam, final IArenaTeam newTeam);
}
