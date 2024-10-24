package org.k99sharma.lld.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder("Adam", "Sandler").build();
        System.out.println(p);
    }
}
