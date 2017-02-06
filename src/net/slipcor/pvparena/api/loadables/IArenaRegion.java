package net.slipcor.pvparena.api.loadables;

public interface IArenaRegion {
    /**
     * RegionType
     * <p/>
     * <pre>
     * CUSTOM => a module added region
     * WATCH  => the spectator region
     * LOUNGE => the ready lounge region
     * BATTLE => the battlefield region
     * JOIN   => the join region
     * SPAWN  => the spawn region
     * BL_INV => blacklist inventory
     * WL_INV => whitelist inventory
     * </pre>
     */
    enum RegionType {
        CUSTOM, WATCH, LOUNGE, BATTLE, JOIN, SPAWN, BL_INV, WL_INV;

        public static RegionType guessFromName(final String regionName) {
            final String name = regionName.toUpperCase();
            for (final RegionType rt : values()) {
                if (name.endsWith(rt.name()) || name.startsWith(rt.name())) {
                    return rt;
                }
            }
            return CUSTOM;
        }
    }
}
