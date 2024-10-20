package org.k99sharma.lld.creational.factory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getPC();
        pc.getModel();

        Computer mac = ComputerFactory.getMac();
        mac.getModel();
    }
}
