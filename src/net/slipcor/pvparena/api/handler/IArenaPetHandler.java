package net.slipcor.pvparena.api.handler;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface IArenaPetHandler {

    /**
     * Add a pet to a player
     *
     * @param player the owner
     * @param entity the pet
     */
    void addPet(final Player player, final Entity entity);

    /**
     * Get the owner of a pet entity
     *
     * @param entity the pet to check
     * @return the owner
     */
    Player getEntityOwner(final Entity entity);

    /**
     * Check whether an entity is a pet in this arena
     *
     * @param entity the entity to check
     * @return true if the entity is a valid pet, false otherwise
     */
    boolean hasEntity(final Entity entity);

    /**
     * Remove a pet
     *
     * @param entity the pet to remove
     */
    void removeEntity(final Entity entity);

    /**
     * Setup the scoreboard for a player
     *
     * @param player the player to set up
     */
    void setupScoreboard(final Player player);
}
