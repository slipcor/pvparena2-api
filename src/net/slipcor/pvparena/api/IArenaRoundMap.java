package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.loadables.IArenaGoal;

import java.util.Set;

public interface IArenaRoundMap {
    /**
     * @return the total round count
     */
    int getCount();

    /**
     * Get all goals of given round number
     * @param round the round number
     * @return the round's goals
     */
    Set<IArenaGoal> getGoals(final int round);

    /**
     * Get the round instance by round number
     * @param round the round number
     * @return the round instance
     */
    IArenaRound getRound(final int round);

    /**
     * Set a round number to a round instance
     * @param round the round number
     * @param value the round to set
     */
    void set(final int round, final IArenaRound value);
}
