package net.slipcor.pvparena.api.handler;

import org.bukkit.entity.Player;

public interface IArenaPlayerHandler {

    /**
     * Reset attributes after death
     *
     * @param player the player to reset
     */
    void resetAttributes(final Player player);
}
