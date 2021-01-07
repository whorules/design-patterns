package ru.korovko.patterns.creational.abstract_factory.car;

public class RetroCar implements Car {

    @Override
    public void create() {
        System.out.println("You've created retro car");
    }
}
