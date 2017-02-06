package net.slipcor.pvparena.api;

import org.bukkit.ChatColor;

import java.util.Set;

public interface IArenaTeam {

    /**
     * Add an arena player to the arena team
     *
     * @param player the player to add
     */
    void add(final IArenaPlayer player);

    /**
     * Colorize a player name
     *
     * @param player the player to colorize
     * @return the colorized player name
     */
    String colorizePlayer(final IArenaPlayer player);

    /**
     * @return the team color
     */
    ChatColor getColor();

    /**
     * @return the colorized team name
     */
    String getColoredName();

    /**
     * @return the hex code with an ampersand (e.g. '&a')
     */
    String getColorCodeString();

    /**
     * @return the team name
     */
    String getName();

    /**
     * @return a HashSet of all arena players in this team
     */
    Set<IArenaPlayer> getTeamMembers();

    /**
     * Check whether a player is in this team
     *
     * @param player the player to find
     * @return true if the player was found, false otherwise
     */
    boolean hasPlayer(final IArenaPlayer player);

    /**
     * Remove a player from the team
     *
     * @param player the player to remove
     */
    void remove(final IArenaPlayer player);
}
