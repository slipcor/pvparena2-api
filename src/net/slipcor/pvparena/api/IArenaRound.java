package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.loadables.IArenaGoal;

import java.util.Set;

public interface IArenaRound {
    /**
     * @return a round's goals
     */
    Set<IArenaGoal> getGoals();

    /**
     * Toggle a goal for a round instance
     * @param arena the arena to save to
     * @param goal the goal to toggle
     * @return true if the goal is active now, false otherwise
     */
    boolean toggle(final IArena arena, final IArenaGoal goal);
}
