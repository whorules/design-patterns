package ru.korovko.patterns.creational.factory_method.rent;

import ru.korovko.patterns.creational.factory_method.transport.Boat;
import ru.korovko.patterns.creational.factory_method.transport.Transport;

public class BoatRent extends Rent {

    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
