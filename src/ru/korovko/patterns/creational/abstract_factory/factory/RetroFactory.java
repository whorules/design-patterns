package ru.korovko.patterns.creational.abstract_factory.factory;

import ru.korovko.patterns.creational.abstract_factory.car.Car;
import ru.korovko.patterns.creational.abstract_factory.car.RetroCar;
import ru.korovko.patterns.creational.abstract_factory.motorcycle.Motorcycle;
import ru.korovko.patterns.creational.abstract_factory.motorcycle.RetroBike;

public class RetroFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new RetroCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new RetroBike();
    }
}
