package ru.korovko.patterns.creational.abstract_factory.motorcycle;

public class RetroBike implements Motorcycle {

    @Override
    public void create() {
        System.out.println("You've created retro motorcycle");
    }
}
