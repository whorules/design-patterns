package ru.korovko.patterns.creational.factory_method.rent;

import ru.korovko.patterns.creational.factory_method.transport.Bicycle;
import ru.korovko.patterns.creational.factory_method.transport.Transport;

public class BicycleRent extends Rent {

    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
