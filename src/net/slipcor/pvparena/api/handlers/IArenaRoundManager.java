package net.slipcor.pvparena.api.handlers;

import net.slipcor.pvparena.api.IArenaRoundMap;

import java.util.List;

public interface IArenaRoundManager {

    /**
     * @return the active round
     */
    int getRound();

    /**
     * @return the total round count
     */
    int getRoundCount();

    /**
     * @return the round definitions
     */
    IArenaRoundMap getRounds();

    /**
     * Save the round definitions
     */
    void saveRoundDefinitions();

    /**
     * Set the round map of this arena
     * @param list the list to interpret
     */
    void setRoundMap(final List<String> list);

    /**
     * Set a round number as active round
     * @param value the round to set
     */
    void setRound(final int value);
}
