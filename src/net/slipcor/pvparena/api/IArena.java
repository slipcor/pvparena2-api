package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.handler.*;
import net.slipcor.pvparena.api.loadables.*;
import net.slipcor.pvparena.api.query.IQueryResult;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import java.util.List;
import java.util.Set;

public interface IArena {
    /**
     * Add an arena goal
     * @param goal the {@link IArenaGoal} to add
     */
    void addGoal(final IArenaGoal goal);

    /**
     * Add an arena module
     * @param mod the module to add
     */
    void addModule(final IArenaModule mod);

    /**
     * @return whether the arena allows for players to join during a battle in progress
     */
    boolean allowsJoinInBattle();

    /**
     * Call event when a player is exiting from an arena (by plugin)
     *
     * @param player the player to remove
     */
    void callExitEvent(final Player player);

    /**
     * Call event when a player is leaving an arena (on his own)
     *
     * @param player the player to remove
     */
    void callLeaveEvent(final Player player);

    /**
     * @return the arena main config
     */
    IArenaConfig getArenaConfig();

    /**
     * @return the arena class handler
     */
    IArenaClassHandler getClassHandler();

    /**
     * @return the arena debugger
     */
    IDebugHandler getDebugger();

    /**
     * hand over everyone being part of the arena
     */
    Set<IArenaPlayer> getEveryone();

    /**
     * hand over all players being member of a team
     */
    Set<IArenaPlayer> getFighters();

    /**
     * @return the {@link IArenaGoal}s
     */
    Set<IArenaGoal> getGoals();

    /**
     * @return the arena language file
     */
    YamlConfiguration getLanguage(); //TODO use proper class instead of YAML crap

    /**
     * @return the arena message handler
     */
    IArenaMessageHandler getMessageHandler();

    /**
     * @return the arena enhancement modules
     */
    Set<IArenaModule> getMods();

    /**
     * @return the arena name
     */
    String getName();

    /**
     * @return the arena owner's name
     */
    String getOwner();

    /**
     * @return a list of players who played this arena
     */
    Set<String> getPlayedPlayers();

    /**
     * @return the played time in seconds
     */
    int getPlayedSeconds();

    /**
     * @return the arena chat prefix
     */
    String getPrefix();

    /**
     * @return the arena pet handler
     */
    IArenaPetHandler getPetHandler();

    /**
     * @return the arena player handler
     */
    IArenaPlayerHandler getPlayerHandler();

    /**
     * @return the arena scoreboard handler
     */
    IArenaScoreboardHandler getScoreboardHandler();

    /**
     * @return the arena team handler
     */
    IArenaTeamHandler getTeamHandler();

    /**
     * Give customized rewards to players
     *
     * @param player the player to give the reward
     */
    void giveRewards(final Player player);

    /**
     * Check whether a player has already played this arena
     *
     * @param playerName the player name to check
     * @return true if they have played, false otherwise
     */
    boolean hasAlreadyPlayed(final String playerName);

    /**
     * Check whether a player is playing in this arena
     *
     * @param player the player to check
     * @return true if they are part of the arena, false otherwise
     */
    boolean hasPlayer(final Player player);

    /**
     * @return true if a game is running, false otherwise
     */
    boolean isFightInProgress();

    /**
     * @return true if the arena is set to "free for all", false otherwise
     */
    boolean isFreeForAll();

    /**
     * @return true if the arena is in edit mode, false otherwise
     */
    boolean isLocked();

    /**
     * @return true if the arena was loaded properly, false otherwise
     */
    boolean isValid();

    /**
     * Mark a player as "has played the arena"
     *
     * @param playerName the player to mark
     */
    void markPlayedPlayer(final String playerName);

    /**
     * Make a player leave the arena
     *
     * @param player the player that is leaving
     * @param coord  the coord string to teleport the player to
     * @param silent should leave messages be suppressed?
     * @param force  should teleportation be enforced?
     */
    void playerLeave(final Player player, final String coord, final boolean silent, final boolean force);

    /**
     * Query loadables for the arena end
     *
     * @return a list of {@link IQueryResult} indicating loadables that want to end the arena
     */
    List<IQueryResult> queryArenaEnd();

    /**
     * @return a list of {@link IQueryResult} indicating missing spawns
     */
    List<IQueryResult> queryMissingSpawns();

    /**
     * Query loadables for player cancellables
     *
     * @param player the {@link IArenaPlayer} that is causing the event
     * @param event the cancellable event to hand over
     *
     * @return a list of {@link IQueryResult} indicating a cancellable event being cancelled
     */
    List<IQueryResult> queryPlayerCancellable(IArenaPlayer player, Cancellable event);

    /**
     * Query loadables for a player dying
     *
     * @param player the {@link IArenaPlayer} that is dying
     *
     * @return a list of {@link IQueryResult} - loadables that want to handle the death
     */
    List<IQueryResult> queryPlayerDeath(IArenaPlayer player);

    /**
     * Query loadables for a player joining an arena
     *
     * @param player the {@link IArenaPlayer} that is joining
     * @param args the join sub-arguments
     *
     * @return a list of {@link IQueryResult} - loadables that want to handle the joining
     */
    List<IQueryResult> queryPlayerJoin(IArenaPlayer player, final String[] args);

    /**
     * Query loadables for player command handling
     *
     * @return a list of {@link IQueryResult} - loadables that want to handle this event actively
     */
    List<IQueryResult> queryPlayerCommand();

    /**
     * @return a list of {@link IQueryResult} indicating the arena not being ready to start
     */
    List<IQueryResult> queryReady();

    /**
     * @param name the spawn name to find
     *
     * @return a list of {@link IQueryResult} - loadables that know this spawn name
     */
    List<IQueryResult> querySpawnKnown(String name);

    /**
     * @return a list of {@link IQueryResult} - loadables that want to handle the arena start
     */
    List<IQueryResult> queryStart();

    /**
     * Check if an arena is ready
     *
     * @return null if ok, error message otherwise
     */
    String ready();

    /**
     * Reload arena and loadable configs
     */
    void reloadConfigs();

    /**
     * Remove a player from the arena
     *
     * @param player the player to reset
     * @param coord  the coord string to teleport the player to
     * @param soft   should location be preserved (another tp incoming)?
     * @param force  should we enforce instant removals?
     */
    void removePlayer(final Player player, final String coord, final boolean soft, final boolean force);

    /**
     * Renew the debugger instance
     */
    void renewDebugger();

    /**
     * reset a player to his pre-join values
     *
     * @param player the player to reset
     * @param coord the coord string to teleport the player to
     * @param soft   if location should be preserved (another tp incoming)
     * @param force  should we enforce instant removals?
     */
    void resetPlayerCompletely(final Player player, final String coord, final boolean soft, final boolean force);

    /**
     * Reset player's attributes after death
     *
     * @param player the player to reset
     */
    void resetPlayerForRespawn(final Player player, final DamageCause cause, final Entity damager);

    /**
     * Reset all arena players (completely)
     *
     * @param force enforce it?
     */
    void resetPlayers(final boolean force);

    /**
     * Reset an arena
     *
     * @param force enforce it?
     */
    void reset(final boolean force);

    /**
     * Set status "fight in progress" of arena
     * @param value the value to set
     */
    void setFightInProgress(final boolean value);

    /**
     * Set status "free for all" of arena
     * @param value the value to set
     */
    void setFree(final boolean value);

    /**
     * Set the owner of the arena
     * @param owner the name of the owner
     */
    void setOwner(final String owner);

    /**
     * Set the arena lock status
     * @param value the value to set
     */
    void setLocked(final boolean value);

    /**
     * Set the arena prefix
     * @param prefix the value to set
     */
    void setPrefix(final String prefix);

    /**
     * Setup an arena based on legacy goals
     *
     * @param goalName the legacy goal name
     * @return true if successful, false otherwise
     */
    boolean setupLegacyGoal(final String goalName);

    /**
     * Damage every fighting player for being near a spawn
     */
    void spawnCampPunish();

    /**
     * Initiate the arena start
     *
     * @param force enforce joining and teleportation
     */
    void start(final boolean force);

    /**
     * Stop the arena
     *
     * @param force enforce reset and teleportation
     */
    void stop(final boolean force);

    /**
     * Remove an arena goal
     *
     * @param goal the goal to remove
     */
    void removeGoal(final IArenaGoal goal);

    /**
     * Remove an arena module
     *
     * @param mod the module to remove
     */
    void removeModule(final IArenaModule mod);

    /**
     * teleport a given player to the given coord string
     *
     * @param player the player to teleport
     * @param coord  the coord string
     */
    void teleportPlayer(final Player player, final String coord);

    /**
     * Toggle an arena goal
     *
     * @param goal the goal to toggle
     * @return true if the goal was, false otherwise
     */
    boolean toggleGoal(final IArenaGoal goal);

    /**
     * Try to put a player into an arena (when no goal/module wants to)
     *
     * @param player the player to put
     * @param team   the arena team to put into
     * @return true if successful, false otherwise
     */
    boolean tryJoin(final Player player, final IArenaTeam team);
}
