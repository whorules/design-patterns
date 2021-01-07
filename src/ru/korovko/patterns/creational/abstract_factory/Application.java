package ru.korovko.patterns.creational.abstract_factory;

import ru.korovko.patterns.creational.abstract_factory.car.Car;
import ru.korovko.patterns.creational.abstract_factory.factory.TransportFactory;
import ru.korovko.patterns.creational.abstract_factory.motorcycle.Motorcycle;

public class Application {

    private final Car car;
    private final Motorcycle motorcycle;

    public Application(TransportFactory transportFactory) {
        this.car = transportFactory.createCar();
        this.motorcycle = transportFactory.createMotorcycle();
    }

    public void create() {
        car.create();
        motorcycle.create();
    }
}
