package ru.korovko.patterns.creational.abstract_factory.car;

public class SportCar implements Car {

    @Override
    public void create() {
        System.out.println("You've created sport car");
    }
}
