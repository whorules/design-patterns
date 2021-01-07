package ru.korovko.patterns.creational.abstract_factory;

import ru.korovko.patterns.creational.abstract_factory.factory.RetroFactory;

public class Main {

    public static void main(String[] args) {
        Application application = new Application(new RetroFactory());
        application.create();
    }
}
