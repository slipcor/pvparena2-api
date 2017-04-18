package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.IArenaRegion;

import java.util.Set;

public interface IArenaRegionHandler {

    /**
     * Add an arena region
     * @param region the region to add
     */
    void addRegion(final IArenaRegion region);

    /**
     * Clean up all regions
     */
    void cleanRegions();

    /**
     * Get an arena region by name
     * @param name the name to find
     * @return the arena region - can be null
     */
    IArenaRegion getRegion(final String name);

    /**
     * @return all defined regions
     */
    Set<IArenaRegion> getRegions();

    /**
     * Get all regions matching a certain type
     * @param regionType the type to find
     * @return all regions matching that type
     */
    Set<IArenaRegion> getRegionsByType(final IArenaRegion.RegionType regionType);
}
