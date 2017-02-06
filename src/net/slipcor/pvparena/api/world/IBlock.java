package net.slipcor.pvparena.api.world;

public interface IBlock {
    /**
     * @return the block location of the block
     */
    IBlockLocation getLocation();

    /**
     * @return the block's name
     */
    String getName();
}
