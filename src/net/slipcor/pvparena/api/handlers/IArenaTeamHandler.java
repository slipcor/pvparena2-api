package net.slipcor.pvparena.api.handlers;

import net.slipcor.pvparena.api.IArenaTeam;

import java.util.Set;

public interface IArenaTeamHandler {
    /**
     * Get an arena team by name
     * @param name the name to find
     * @return the arema team - can be null
     */
    IArenaTeam getTeam(final String name);

    /**
     * @return the arena teams
     */
    Set<IArenaTeam> getTeams();

    /**
     * @return the arena team names
     */
    Set<String> getTeamNames();

    /**
     * @return the colored arena team names
     */
    Set<String> getTeamNamesColored();
}
