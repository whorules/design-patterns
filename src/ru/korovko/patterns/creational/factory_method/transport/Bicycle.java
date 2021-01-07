package ru.korovko.patterns.creational.factory_method.transport;

public class Bicycle implements Transport {

    @Override
    public void rent() {
        System.out.println("You've rented a bicycle");
    }
}
