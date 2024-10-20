package org.k99sharma.lld.creational.factory;

public class ComputerFactory {
    public static Computer getPC(){
        return new PC();
    }

    public static Computer getMac(){
        return new Mac();
    }
}
