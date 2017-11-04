package com.rotoai.dirk.sample.di;

public interface ClassInjector<T> {
    void inject(T t);
}
