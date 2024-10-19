package org.k99sharma.lld.creational.singleton;

/**
 * Bill Pugh Singleton
 *
 * It uses inner-class to provide instance of singleton class
 */
public class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void display(){
        System.out.println("Instance of Bill Pugh singleton class!");
    }
}
