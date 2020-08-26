package com.maxmind.db;

import java.io.IOException;

/**
 * A no-op cache singleton.
 */
public class NoCache implements NodeCache {

    private static final NoCache INSTANCE = new NoCache();

    public NoCache() {
    }

    @Override
    public Object get(CacheKey key, Loader loader) throws IOException {
        return loader.load(key);
    }

    public static NoCache getInstance() {
        return INSTANCE;
    }

}
