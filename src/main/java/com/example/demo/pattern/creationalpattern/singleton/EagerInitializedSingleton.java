package com.example.demo.pattern.creationalpattern.singleton;

/**
 * Instance of the class is created at the time of class loading.
 * Cons: May not use by application
 * Examples: Database connection,
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
