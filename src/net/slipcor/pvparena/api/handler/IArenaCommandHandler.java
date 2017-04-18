package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.IArena;
import net.slipcor.pvparena.api.command.ICommandTree;
import org.bukkit.command.CommandSender;

import java.util.List;

public interface IArenaCommandHandler {
    /**
     * Get all main commands
     *
     * @return all valid first sub command arguments
     */
    List<String> getMain();

    /**
     * Get all main shortcuts
     *
     * @return all valid shortcuts of first sub command arguments
     */
    List<String> getShort();

    /**
     * Get the CommandTree
     *
     * @param arena the arena instance
     * @return the CommandTree for this ArenaCommandHandler
     */
    ICommandTree<String> getSubs(final IArena arena);

    /**
     * Does the sender have the permissions for this command?
     *
     * @param sender the CommandSender to check
     * @param arena  the arena they are part of
     * @return true if they have the perms, false otherwise
     */
    boolean hasPerms(final CommandSender sender, final IArena arena);
}
