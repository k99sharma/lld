package org.k99sharma.lld.creational.factory;

public class PC implements Computer{
    @Override
    public void getModel() {
        System.out.println("This model is a PC.");
    }
}
