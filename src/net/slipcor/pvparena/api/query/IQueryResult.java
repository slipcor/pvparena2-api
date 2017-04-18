package net.slipcor.pvparena.api.query;

import net.slipcor.pvparena.api.loadables.ILoadable;

import java.util.Optional;

/**
 * This result will be optionally returned by queried loadables.
 *
 * If empty, the loadable does not care about this event.
 *
 * If not empty, the loadable might have found a reason to object (objection) or wants to handle the query event
 */
public interface IQueryResult {
    /**
     * @return the {@link ILoadable} that replies to this query
     */
    ILoadable getAnsweringLoadable();

    /**
     * @return an optional message returned by the query
     */
    Optional<String> getMessage();

    /**
     * @return whether the loadable has an objection to the query
     */
    boolean hasObjection();
}
