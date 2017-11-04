package com.rotoai.dirk.sample.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Indicates that this scope is per application - essentially, a Singleton.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApp {
}
