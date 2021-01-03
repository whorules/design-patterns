package ru.korovko.patterns.creational.singletone;

import ru.korovko.patterns.creational.singletone.lazy.LazySingleton;
import ru.korovko.patterns.creational.singletone.statik.StaticSingleton;
import ru.korovko.patterns.creational.singletone.threadsafe.ThreadsafeSingleton;

public class Main {

    public static void main(String[] args) {
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        StaticSingleton anotherStaticSingleton = StaticSingleton.getInstance();
        System.out.println(staticSingleton == anotherStaticSingleton); // references are the same

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton anotherLazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton == anotherLazySingleton); // true

        ThreadsafeSingleton threadsafeSingleton = ThreadsafeSingleton.getInstance();
        ThreadsafeSingleton anotherThreadsafeSingleton = ThreadsafeSingleton.getInstance();
        System.out.println(threadsafeSingleton == anotherThreadsafeSingleton); // true
    }
}
