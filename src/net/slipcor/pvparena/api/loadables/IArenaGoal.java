package net.slipcor.pvparena.api.loadables;

import net.slipcor.pvparena.api.IArena;
import net.slipcor.pvparena.api.IArenaPlayer;
import net.slipcor.pvparena.api.query.IQueryResult;
import org.bukkit.event.Cancellable;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Optional;

public interface IArenaGoal extends ILoadable {

    /**
     * @return whether the goal allows for players to join during a battle in progress
     */
    boolean allowsJoinInBattle();

    /**
     * @return an Optional of type {@link IQueryResult}, not empty if the goal wants to end the arena
     */
    Optional<IQueryResult> arenaEndCheck();

    /**
     * End an arena match, get everyone out and hand out rewards
     *
     * @param force whether the arena was force stopped
     */
    void arenaEndHandle(final boolean force);

    /**
     * Clean up, reset all values on arena end
     *
     * @param force whether the arena was force stopped
     */
    void arenaResetHandle(final boolean force);

    /**
     * @return an Optional of type {@link IQueryResult}, not empty if the goal is missing spawns
     */
    Optional<IQueryResult> missingSpawnsCheck();

    /**
     * Do something while the goal loads
     */
    void onLoad();

    /**
     * @param player the {@link IArenaPlayer} that is causing the event
     * @param event the cancellable event to hand over
     *
     * @return an Optional of type {@link IQueryResult}, not empty if the goal cancelled the event
     */
    Optional<IQueryResult> playerCancellableCheck(final IArenaPlayer player, final Cancellable event);

    /**
     * Handle a non cancelled event
     *
     * @param player the {@link IArenaPlayer} that is causing the event
     * @param event the cancellable event to hand over
     */
    void playerCancellableHandle(final IArenaPlayer player, final Cancellable event);

    /**
     * @param player the {@link IArenaPlayer} that is dying
     *
     * @return an Optional of type {@link IQueryResult}, not empty if the goal wants to handle the event
     */
    Optional<IQueryResult> playerDeathCheck(final IArenaPlayer player);

    /**
     * Handle a death event
     *
     * @param player the {@link IArenaPlayer} that is dying
     * @param event the event causing the death
     */
    void playerDeathHandle(final IArenaPlayer player, final PlayerDeathEvent event);

    /**
     * Handle the aftermath of a death event
     *
     * @param player the {@link IArenaPlayer} that was dying
     * @param event the event causing the death
     */
    void playerDeathPostHandle(final IArenaPlayer player, final PlayerDeathEvent event);

    /**
     * Clean up after a player when they disconnect
     *
     * @param player the {@link IArenaPlayer} who disconnects
     */
    void playerDisconnectHandle(final IArenaPlayer player);

    /**
     * @param player the {@link IArenaPlayer} that is joining
     * @param args the join sub-arguments
     *
     * @return an Optional of type {@link IQueryResult}, not empty if the goal wants to handle the joining
     */
    Optional<IQueryResult> playerJoinCheck(final IArenaPlayer player, final String[] args);

    /**
     * Prepare a player for battle after joining
     *
     * @param player the {@link IArenaPlayer} to prepare
     */
    void playerJoinPostHandle(final IArenaPlayer player);

    /**
     * Clean up after a player when they leave the arena
     *
     * @param player the {@link IArenaPlayer} who leaves the arena
     */
    void playerLeavePostHandle(final IArenaPlayer player);

    /**
     * Add goal specific information to send out to the player on request with /pa info
     *
     * @param player the {@link IArenaPlayer} to message
     */
    void playerSendInfoMessage(final IArenaPlayer player);

    /**
     * Query loadables for player command handling
     *
     * @param cmd the command name to check
     *
     * @return an Optional of type {@link IQueryResult}, not empty if the goal wants to handle the command
     */
    Optional<IQueryResult> playerCommandCheck(final String cmd);

    /**
     * Handle a command
     *
     * @param player the {@link IArenaPlayer} issuing the command
     * @param args the command and subcommands bring issued
     */
    void playerCommandHandle(final IArenaPlayer player, final String[] args);

    /**
     * @return an Optional of type {@link IQueryResult}, not empty if the goal is not ready
     */
    Optional<IQueryResult> readyCheck();

    /**
     * Attach the goal to an {@link IArena}
     */
    void setArena(final IArena arena);

    /**
     * @param name the name to find
     * @return an Optional of type {@link IQueryResult}, not empty if the goal knows this spawn name
     */
    Optional<IQueryResult> spawnKnown(final String name);

    /**
     * @return an Optional of type {@link IQueryResult}, not empty if the goal wants to handle the arena start
     */
    Optional<IQueryResult> startCheck();

    /**
     * Handle the arena start
     */
    void startHandle();

    /**
     * Handle the aftermath of the arena start
     */
    void startPostHandle();
}
