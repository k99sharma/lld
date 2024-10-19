package org.k99sharma.lld.creational.singleton;

/**
 * Lazy Initialization
 *
 * Not thread safe
 */
public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {}

    public static LazyInitialization getInstance(){
        if(instance == null)
            instance = new LazyInitialization();

        return instance;
    }

    public void display(){
        System.out.println("Instance of lazy initialization!");
    }
}
