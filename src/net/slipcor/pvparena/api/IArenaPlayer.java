package net.slipcor.pvparena.api;

import net.slipcor.pvparena.api.world.IBlockLocation;
import net.slipcor.pvparena.api.world.ILocation;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Set;

public interface IArenaPlayer {
    /**
     * Status
     *
     * <pre>
     * - NULL = not part of an arena
     * - WARM = not part of an arena, warmed up
     * - LOUNGE = inside an arena lobby mode
     * - READY = inside an arena lobby mode, readied up
     * - FIGHT = fighting inside an arena
     * - WATCH = watching a fight from the spectator area
     * - DEAD = dead and soon respawning
     * - LOST = lost and thus spectating
     * </pre>
     */
    enum Status {
        NULL, WARM, LOUNGE, READY, FIGHT, WATCH, DEAD, LOST
    }

    /**
     * PlayerPrevention
     *
     * <pre>
     * BREAK - Block break
     * PLACE - Block placement
     * TNT - TNT usage
     * TNTBREAK - TNT block break
     * DROP - dropping items
     * INVENTORY - accessing inventory
     * PICKUP - picking up stuff
     * CRAFT - crafting stuff
     * </pre>
     */
    enum PlayerPrevention {
        BREAK, PLACE, TNT, TNTBREAK, DROP, INVENTORY, PICKUP, CRAFT;
        public static boolean has(int value, PlayerPrevention s) {
            return (((int) Math.pow(2, s.ordinal()) & value) > 0);
        }
    }

    /**
     * Backup a player's inventory and clear it
     */
    void backupAndClearInventory();

    /**
     * Save a player's join values
     *
     * @param player the player to save
     */
    void createState(final Player player);

    /**
     * Print player information to the debug
     */
    void debugPrint();

    /**
     * @return true if the player has seleceted two points, false otherwise
     */
    boolean didValidSelection();

    /**
     * Dump player information to a file
     */
    void dump();

    /**
     * @return the Bukkit player instance - can be null when dead or logging out!
     */
    Player get();

    /**
     * @return the arena a player is in - can be null
     */
    IArena getArena();

    /**
     * @return the arena class a player has - can be null
     */
    IArenaClass getArenaClass();

    /**
     * @return the arena team a player is in - can be null
     */
    IArenaTeam getArenaTeam();

    /**
     * @return the scoreboard a player had before joining
     */
    Scoreboard getBackupScoreboard();

    /**
     * @return the scoreboard team a player was part of before joining
     */
    Team getBackupScoreboardTeam();

    /**
     * @return the player's name
     */
    String getName();

    /**
     * @return the player's next arena class (after respawn)
     */
    IArenaClass getNextArenaClass();

    /**
     * @return the player's pre-join location
     */
    ILocation getSavedLocation();

    /**
     * @return the blocks a player selected
     */
    IBlockLocation[] getSelection();

    /**
     * @return the player pre-join state
     */
    IArenaPlayerState getState();

    /**
     * @return the player's status
     */
    Status getStatus();

    /**
     * @return the player's temporary permissions
     */
    Set<PermissionAttachment> getTempPermissions();

    /**
     * supply a player with class items
     */
    void givePlayerFightItems();

    /**
     * @return true if the player has a backed up scoreboard, false otherwise
     */
    boolean hasBackupScoreboard();

    /**
     * @return true if the player may drop his inventory items, false otherwise
     */
    boolean isAllowDropInventory();

    /**
     * @return true if the player is allowed to teleport, false otherwise
     */
    boolean isAllowTeleport();

    /**
     * @return true if the player is chatting to the public, false otherwise
     */
    boolean isPublicChatting();

    /**
     * @return true if the player is being teleported, false otherwise
     */
    boolean isTeleporting();

    /**
     * Read a player's dump file
     */
    void readDump();

    /**
     * Reload a player's inventory
     *
     * @param instant enforce instant reload?
     */
    void reloadInventory(final boolean instant);

    /**
     * Save and reset a player
     */
    void reset();


    /**
     * Set the player's arena
     *
     * @param arena the arena to set
     */
    void setArena(final IArena arena);

    /**
     * Set the player's arena class
     *
     * @param aClass the arena class to set
     */
    void setArenaClass(final IArenaClass aClass);

    /**
     * Set a player's arena class by name
     *
     * @param className an arena class name
     */
    void setArenaClass(final String className);

    /**
     * Set a player's backup scoreboard
     *
     * @param board the board to set
     */
    void setBackupScoreboard(Scoreboard board);

    /**
     * Set a player's backup scoreboard team
     * @param team the team to set
     */
    void setBackupScoreboardTeam(Team team);

    /**
     * Set a player's ignore status
     * @param value the value to set
     */
    void setIgnoreAnnouncements(final boolean value);

    /**
     * Set a player's pre-join location
     * @param location the location to set
     */
    void setLocation(final ILocation location);

    /**
     * Set a player's next arena class
     *
     * @param arenaClass the class to set
     */
    void setNextArenaClass(IArenaClass arenaClass);

    /**
     * Set a player's public chatting status
     *
     * @param value the value to set
     */
    void setPublicChatting(final boolean value);

    /**
     * Set a player's selection
     * @param loc the location to set
     * @param second if true set the second block, otherwise, set the first block
     */
    void setSelection(final Location loc, final boolean second);

    /**
     * Set the inventory drop allowance
     *
     * @param value the value to set
     */
    void setAllowDropInventory(boolean value);

    /**
     * Set the teleport allowance
     *
     * @param value the value to set
     */
    void setAllowTeleport(final boolean value);

    /**
     * Set the arena player status
     *
     * @param status the status to set
     */
    void setStatus(final Status status);

    /**
     * Set the teleport status
     *
     * @param value the value to set
     */
    void setTeleporting(final boolean value);
}
