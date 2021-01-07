package ru.korovko.patterns.creational.factory_method.transport;

public class Boat implements Transport {

    @Override
    public void rent() {
        System.out.println("You've rented a boat");
    }
}
