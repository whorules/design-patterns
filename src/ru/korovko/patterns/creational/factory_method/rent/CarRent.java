package ru.korovko.patterns.creational.factory_method.rent;

import ru.korovko.patterns.creational.factory_method.transport.Car;
import ru.korovko.patterns.creational.factory_method.transport.Transport;

public class CarRent extends Rent {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
