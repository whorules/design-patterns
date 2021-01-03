package ru.korovko.patterns.creational.singletone.statik;

/**
 * I use "statik" package name because correct package name "static" can't be used for java classes
 */
public class StaticSingleton {

    private static final StaticSingleton singleton = new StaticSingleton();

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        return singleton;
    }
}
