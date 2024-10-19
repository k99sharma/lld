package org.k99sharma.lld.creational.singleton;

/**
 * Thread-safe lazy initialization
 *
 * Thread-safe class
 * Performance not good
 */
public class ThreadSafeLazyInitialization {
    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization() {}

    public synchronized static ThreadSafeLazyInitialization getInstance(){
        if(instance == null)
            instance = new ThreadSafeLazyInitialization();

        return instance;
    }

    public void display(){
        System.out.println("Instance of thread-safe lazy initialization!");
    }
}
