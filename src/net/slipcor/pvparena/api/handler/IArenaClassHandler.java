package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.IArenaClass;
import net.slipcor.pvparena.api.IArenaClassSign;
import net.slipcor.pvparena.api.IArenaPlayer;
import org.bukkit.block.Sign;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public interface IArenaClassHandler {

    /**
     * Add a class definition
     *
     * @param className the desired class name
     * @param items the desired inventory items
     * @param offHand the desired offhand slot item
     * @param armors the desired armor slot items
     */
    void addClass(String className, ItemStack[] items, ItemStack offHand, ItemStack[] armors);

    /**
     * Get an arena class by name
     *
     * @param name the class name to find
     * @return the class if found, null otherwise
     */
    IArenaClass getClass(final String name);

    /**
     * @return all classes defined in the arena
     */
    Set<IArenaClass> getClasses();

    /**
     * @return all registered class signs
     */
    Set<IArenaClassSign> getSigns();

    /**
     * Remove a class definition
     * @param name the name of the class to remove
     */
    void removeClass(final String name);

    /**
     * Choose a class for a player
     *
     * @param player the player to make choose
     * @param sign the sign they clicked - can be null
     * @param className the class name to choose
     */
    void selectClass(final IArenaPlayer player, final Sign sign, final String className);
}
