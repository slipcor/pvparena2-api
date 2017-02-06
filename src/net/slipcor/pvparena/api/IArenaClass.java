package net.slipcor.pvparena.api;

import org.bukkit.inventory.ItemStack;

public interface IArenaClass {
    /**
     * Equip a player with the class items
     * @param arenaPlayer the player to equip
     */
    void equip(IArenaPlayer arenaPlayer);

    /**
     * @return the class name
     */
    String getName();

    /**
     * @return the armor items
     */
    ItemStack[] getArmors();

    /**
     * @return the inventory items
     */
    ItemStack[] getItems();

    /**
     * @return the offhand item
     */
    ItemStack getOffHand();
}
