package ru.korovko.patterns.creational.factory_method.rent;

import ru.korovko.patterns.creational.factory_method.transport.Transport;

public abstract class Rent {

    public void rentTransport() {
        Transport transport = createTransport();
        transport.rent();
    }

    abstract Transport createTransport();
}
