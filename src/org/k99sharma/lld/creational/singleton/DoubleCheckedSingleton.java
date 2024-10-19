package org.k99sharma.lld.creational.singleton;

/**
 * Double-checked singleton
 *
 * synchronization block is used to make it thread safe
 * instance variable is made volatile
 */
public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckedSingleton();
                }
            }
        }

        return instance;
    }

    public void display(){
        System.out.println("Instance of double checked singleton class!");
    }
}
