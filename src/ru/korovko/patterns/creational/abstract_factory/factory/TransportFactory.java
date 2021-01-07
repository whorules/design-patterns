package ru.korovko.patterns.creational.abstract_factory.factory;

import ru.korovko.patterns.creational.abstract_factory.car.Car;
import ru.korovko.patterns.creational.abstract_factory.motorcycle.Motorcycle;

public interface TransportFactory {

    Car createCar();

    Motorcycle createMotorcycle();
}
