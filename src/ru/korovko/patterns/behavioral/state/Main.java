package ru.korovko.patterns.behavioral.state;

import ru.korovko.patterns.behavioral.state.order.Order;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getCurrentState());

        order.process();
        System.out.println(order.getCurrentState());

        order.process();
        System.out.println(order.getCurrentState());

        order.process();
        System.out.println(order.getCurrentState());
    }
}
