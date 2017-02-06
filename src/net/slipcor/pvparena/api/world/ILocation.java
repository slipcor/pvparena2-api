package net.slipcor.pvparena.api.world;

import org.bukkit.Location;

public interface ILocation {
    /**
     * Get a new location with given offset from this location
     * @param x the x-offset
     * @param y the y-offset
     * @param z the z-offset
     * @return the new location
     */
    ILocation add(final double x, final double y, final double z);
    /**
     * Calculate the distance between this and another location
     *
     * @param otherLocation the other location
     * @return the distance in meters
     */
    double getDistance(final ILocation otherLocation);

    /**
     * Calculate the squared distance between this and another location
     *
     * @param otherLocation the other location
     * @return the distance in meters
     */
    double getDistanceSquared(final ILocation otherLocation);

    /**
     * @return the location's pitch
     */
    double getPitch();

    /**
     * @return the name of the world the block location is in
     */
    String getWorldName();

    /**
     * @return the location's X coordinate
     */
    double getX();

    /**
     * @return the location's Y coordinate
     */
    double getY();

    /**
     * @return the location's yaw
     */
    double getYaw();

    /**
     * @return the location's Z coordinate
     */
    double getZ();
    /**
     * @return the block's X coordinate
     */
    int getBlockX();

    /**
     * @return the block's Y coordinate
     */
    int getBlockY();

    /**
     * @return the block's Z coordinate
     */
    int getBlockZ();

    /**
     * Set the location's pitch
     *
     * @param value the value to set
     */
    void setPitch(final float value) ;

    /**
     * Set the X-coordinate
     *
     * @param value the value to set
     */
    void setX(final double value);

    /**
     * Set the Y-coordinate
     *
     * @param value the value to set
     */
    void setY(final double value);

    /**
     * Set the location's yaw
     *
     * @param value the value to set
     */
    void setYaw(final float value) ;

    /**
     * Set the Z-coordinate
     *
     * @param value the value to set
     */
    void setZ(final double value);

    /**
     * @return the Bukkit equivalent of this block location
     */
    Location toLocation();

}
