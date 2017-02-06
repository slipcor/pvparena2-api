package net.slipcor.pvparena.api.world;

import org.bukkit.Location;

public interface IBlockLocation {
    /**
     * Calculate the distance between this and another location
     *
     * @param otherLocation the other location
     * @return the distance in meters
     */
    double getDistance(final IBlockLocation otherLocation);

    /**
     * Calculate the squared distance between this and another location
     *
     * @param otherLocation the other location
     * @return the distance in meters
     */
    double getDistanceSquared(final IBlockLocation otherLocation);

    /**
     * Calculate the mid point between this and another location
     *
     * @param location the other location
     * @return the mid point between this and the other location
     */
    IBlockLocation getMidpoint(final IBlockLocation location);

    /**
     * @return the name of the world the block location is in
     */
    String getWorldName();

    /**
     * @return the block's X coordinate
     */
    int getX();

    /**
     * @return the block's Y coordinate
     */
    int getY();

    /**
     * @return the block's Z coordinate
     */
    int getZ();

    /**
     * Check whether this location is inside a cuboid with the given locations
     * @param min the minimum location
     * @param max the maximum location
     * @return true if this location is inside, false otherwise
     */
    boolean isInAABB(final IBlockLocation min, final IBlockLocation max);

    /**
     * Calculate a location that is pointing towards a destination location
     * @param dest the destination location
     * @param length the target block range
     * @return the location of a block in dest-direction
     */
    IBlockLocation pointTo(final IBlockLocation dest, final Double length);

    /**
     * Set the X-coordinate
     *
     * @param value the value to set
     */
    void setX(final int value);

    /**
     * Set the Y-coordinate
     *
     * @param value the value to set
     */
    void setY(final int value);

    /**
     * Set the Z-coordinate
     *
     * @param value the value to set
     */
    void setZ(final int value);

    /**
     * @return the Bukkit equivalent of this block location
     */
    Location toLocation();

}
