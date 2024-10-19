package org.k99sharma.lld.creational.singleton;

/**
 * Eager Initialization
 *
 * Class instance is created at the time of loading by JVM
 */
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance(){
        return instance;
    }

    public void display(){
        System.out.println("Instance of eager initialization!");
    }
}
