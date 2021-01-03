package ru.korovko.patterns.creational.singletone.threadsafe;

public class ThreadsafeSingleton {

    private static volatile ThreadsafeSingleton singleton;

    private ThreadsafeSingleton() {
        if (singleton != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static ThreadsafeSingleton getInstance() {
        if (singleton == null) {
            synchronized(ThreadsafeSingleton.class) {
                if (singleton == null) {
                    singleton = new ThreadsafeSingleton();
                }
            }
        }
        return singleton;
    }
}
