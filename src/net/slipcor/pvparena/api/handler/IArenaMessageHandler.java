package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.IArenaPlayer;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public interface IArenaMessageHandler {

    /**
     * Broadcast a message to the whole arena
     * @param msg the message to send
     */
    void broadcast(final String msg);

    /**
     * Broadcast a message to the whole arena, prefix player name and ChatColor
     *
     * @param msg    the message to send
     * @param color  the color to use
     * @param player the player to prefix
     */
    void broadcastColored(final String msg, final ChatColor color,
                          final Player player);

    /**
     * Broadcast a message to the whole arena except the given one
     *
     * @param msg    the message to send
     * @param sender the player to exclude
     */
    void broadcastExcept(final String msg, final CommandSender sender);

    /**
     * Send a message to a commandsender (not necessarily a player)
     *
     * @param sender the commandsender to send to
     * @param msg    the messaeg to send
     */
    void msg(final CommandSender sender, final String... msg);

    /**
     * Send a message to an arena player
     *
     * @param player the player to send to
     * @param msg    the message to send
     */
    void msg(final IArenaPlayer player, final String... msg);

    /**
     * return an understandable representation of a player's death cause
     *
     * @param player  the dying player
     * @param cause   the cause
     * @param damager an eventual damager entity
     * @return a colored string
     */
    String parseDeathCause(final Player player, final EntityDamageEvent.DamageCause cause,
                           final Entity damager);

    /**
     * send a message to every player of a given team
     *
     * @param sTeam the team to send to
     * @param msg    the message to send
     * @param color  the color to use
     * @param player the player to prefix
     */
    void tellTeam(final String sTeam, final String msg, final ChatColor color,
                  final Player player);
}
