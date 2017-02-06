package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.handlers.*;
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
     * @return the arena commands
     */
    List<IArenaCommand> getArenaCommands();

    /**
     * @return the global commands
     */
    List<IGlobalCommand> getGlobalCommands();

    boolean hasAdminPerms(final CommandSender sender);

    boolean hasCreatePerms(final CommandSender sender, final IArena arena);

    boolean hasOverridePerms(final CommandSender sender);

    boolean hasPerms(final CommandSender sender, final IArena arena);

    boolean isShuttingDown();
}
