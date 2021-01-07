package ru.korovko.patterns.creational.abstract_factory.motorcycle;

public class SportBike implements Motorcycle {

    @Override
    public void create() {
        System.out.println("You've created sport motorcycle");
    }
}
