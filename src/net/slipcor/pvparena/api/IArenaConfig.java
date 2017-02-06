package net.slipcor.pvparena.api;

import com.sun.javafx.geom.Vec3d;
import net.slipcor.pvparena.api.world.*;

import java.util.Set;

public interface IArenaConfig {

    /**
     * Add a block definition to the arena block list
     * @param paBlock the block to add
     */
    void addBlock(final IBlock paBlock);

    /**
     * Add a spawn definition to the arena spawn list
     * @param paSpawn the spawn to add
     */
    void addSpawn(final ISpawn paSpawn);

    /**
     * @return all defined arena blocks
     */
    Set<IBlock> getBlocks();

    /**
     * Get a spawn's offset
     *
     * @param name the spawn name to read
     * @return an offset vector
     */
    Vec3d getOffset(String name);

    /**
     * @return all defined arena spawns
     */
    Set<ISpawn> getSpawns();

    /**
     * Remove the offset of a spawn
     *
     * @param name the spawn name to reset
     */
    void removeOffset(final String name);

    /**
     * Set the offset of a spawn
     *
     * @param name the spawn to update
     * @param x the x-offset
     * @param y the y-offset
     * @param z the z-offset
     */
    void setOffset(final String name, final double x, final double y, final double z);

    /**
     * Save a block definition to the config
     *
     * @param name the destination node name
     * @param blockLocation the block location to save
     */
    void saveBlock(final String name, final IBlockLocation blockLocation);

    /**
     * Save a spawn definition to the config
     *
     * @param name the destination node name
     * @param location the location to save
     */
    void saveSpawn(final String name, final ILocation location);
}
