package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.command.IArenaCommand;
import net.slipcor.pvparena.api.command.IGlobalCommand;
import net.slipcor.pvparena.api.handler.*;
import org.bukkit.command.CommandSender;

import java.util.List;

public interface IPVPArena {

    /**
     * @return the {@link IArenaGoalHandler} instance
     */
    IArenaGoalHandler getArenaGoalHandler();

    /**
     * @return the {@link IArenaHandler} instance
     */
    IArenaHandler getArenaHandler();

    /**
     * @return the {@link IArenaModuleHandler} instance
     */
    IArenaModuleHandler getArenaModuleHandler();

    /**
     * @return the {@link IArenaRegionShapeHandler} instance
     */
    IArenaRegionShapeHandler getArenaRegionShapeHandler();
    /**
     * @return the {@link IArenaCommand} list
     */
    List<IArenaCommand> getArenaCommands();

    /**
     * @return the {@link IGlobalCommand} list
     */
    List<IGlobalCommand> getGlobalCommands();

    /**
     * @param sender the {@link CommandSender} to check
     * @return whether the {@link CommandSender} has admin permissions
     */
    boolean hasAdminPerms(final CommandSender sender);

    /**
     * @param sender the {@link CommandSender} to check
     * @return whether the {@link CommandSender} has arena creation permissions
     */
    boolean hasCreatePerms(final CommandSender sender, final IArena arena);

    /**
     * @param sender the {@link CommandSender} to check
     * @return whether the {@link CommandSender} has override permissions
     */
    boolean hasOverridePerms(final CommandSender sender);

    /**
     * @param sender the {@link CommandSender} to check
     * @param arena the {@link IArena} to check for
     * @return whether the {@link CommandSender} has permission for an {@link IArena}
     */
    boolean hasPerms(final CommandSender sender, final IArena arena);

    /**
     * @return whether the plugin is currently shutting down
     */
    boolean isShuttingDown();
}
