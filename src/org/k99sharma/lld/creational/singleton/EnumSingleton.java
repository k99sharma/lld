package org.k99sharma.lld.creational.singleton;

/**
 * Enum Singleton
 *
 * Most robust way to create singleton classes
 */
public enum EnumSingleton {
    INSTANCE;

    public void display(){
        System.out.println("Instance of enum singleton.");
    }
}
