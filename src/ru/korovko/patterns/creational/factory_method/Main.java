package ru.korovko.patterns.creational.factory_method;

import ru.korovko.patterns.creational.factory_method.rent.BicycleRent;
import ru.korovko.patterns.creational.factory_method.rent.BoatRent;
import ru.korovko.patterns.creational.factory_method.rent.CarRent;
import ru.korovko.patterns.creational.factory_method.rent.Rent;
import ru.korovko.patterns.creational.factory_method.transport.TransportType;

public class Main {

    public static void main(String[] args) {
        Rent rent = configure(TransportType.CAR);
        rent.rentTransport();

    }

    public static Rent configure(TransportType transportType) {
        switch (transportType) {
            case CAR:
                return new CarRent();
            case BOAT:
                return new BoatRent();
            case BICYCLE:
                return new BicycleRent();
            default:
                throw new IllegalArgumentException("Transport you want to rent dost not exist");
        }
    }
}
