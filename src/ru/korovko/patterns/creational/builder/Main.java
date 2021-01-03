package ru.korovko.patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .age(15)
                .name("Tonny")
                .address("190003, Russia")
                .build();
        System.out.println(user.toString());
    }
}
