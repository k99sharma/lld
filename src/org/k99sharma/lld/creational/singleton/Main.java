package org.k99sharma.lld.creational.singleton;

public class Main {
    public static void main(String[] args){
        // 1. Lazy Initialization
        LazyInitialization instance1 = LazyInitialization.getInstance();
        instance1.display();

        // 2. Thread-Safe Lazy Initialization
        ThreadSafeLazyInitialization instance2 = ThreadSafeLazyInitialization.getInstance();
        instance2.display();

        // 3. Double-checked Singleton
        DoubleCheckedSingleton instance3 = DoubleCheckedSingleton.getInstance();
        instance3.display();

        // 4. Eager Initialization Singleton
        EagerInitialization instance4 = EagerInitialization.getInstance();
        instance4.display();

        // 5. Bill Pugh Singleton
        BillPughSingleton instance5 = BillPughSingleton.getInstance();
        instance5.display();

        // 6. Enum Singleton
        EnumSingleton instance6 = EnumSingleton.INSTANCE;
        instance6.display();
    }
}
