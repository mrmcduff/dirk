package com.rotoai.dirk.core;

/**
 * Parameterized injection type that Dirk Components should extend.
 *
 * @param <T> the class being injected
 */
public interface ClassInjector<T> {

    void inject(T t);
}
