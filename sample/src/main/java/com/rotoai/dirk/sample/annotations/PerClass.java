package com.rotoai.dirk.sample.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Indicates that this scope is per class.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerClass {
}
