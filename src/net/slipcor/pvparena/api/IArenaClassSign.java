package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.world.IBlockLocation;
import org.bukkit.entity.Player;

public interface IArenaClassSign {

    /**
     * Add a player name to a sign
     *
     * @param player the player name to add
     * @return true if successful, false otherwise
     */
    boolean add(final Player player);

    /**
     * Clear the sign contents
     */
    void clear();

    /**
     * @return the sign block location
     */
    IBlockLocation getLocation();

    /**
     * Remove a player from a sign
     *
     * @param player the player to remove
     */
    void remove(final Player player);
}
