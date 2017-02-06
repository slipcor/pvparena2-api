package net.slipcor.pvparena.api.handlers;

import net.slipcor.pvparena.api.IArena;

import java.util.List;

public interface IArenaHandler {
    /**
     * @return all {@link IArena}s
     */
    List<IArena> getArenas();
}
