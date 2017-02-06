package net.slipcor.pvparena.api.world;

public interface ISpawn {
    /**
     * @return the block location of the block
     */
    ILocation getLocation();

    /**
     * @return the block's name
     */
    String getName();
}
