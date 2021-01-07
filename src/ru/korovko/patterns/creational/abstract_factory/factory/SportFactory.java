package ru.korovko.patterns.creational.abstract_factory.factory;

import ru.korovko.patterns.creational.abstract_factory.car.Car;
import ru.korovko.patterns.creational.abstract_factory.car.SportCar;
import ru.korovko.patterns.creational.abstract_factory.motorcycle.Motorcycle;
import ru.korovko.patterns.creational.abstract_factory.motorcycle.SportBike;

public class SportFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new SportCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new SportBike();
    }
}
