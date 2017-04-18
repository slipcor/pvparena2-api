package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.loadables.IArenaGoal;

import java.util.List;
import java.util.Optional;

public interface IArenaGoalHandler {
    /**
     * @param name the name to look for
     * @return an Optional of type {@link IArenaGoal}
     */
    Optional<IArenaGoal> getGoal(String name);

    /**
     * @return the names of all installed {@link IArenaGoal}s
     */
    List<String> getGoalNames();

    /**
     * @return a list of all installed {@link IArenaGoal}s
     */
    List<IArenaGoal> getGoals();

    /**
     * Reload all arena goal files and configurations
     */
    void reloadGoals();

    /**
     * Unload all arena goals
     */
    void unloadGoals();
}
