package net.slipcor.pvparena.api.handler;

import net.slipcor.pvparena.api.IArena;

import java.util.List;

public interface IArenaHandler {
    /**
     * @return the {@link IArena} list
     */
    List<IArena> getArenas();
}
