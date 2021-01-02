package ru.korovko.patterns.behavioral.state.states;

import ru.korovko.patterns.behavioral.state.order.Order;

public class DeliveredState extends State {

    public DeliveredState(Order order) {
        super(order);
        System.out.println("We've delivered your order");
    }

    @Override
    public void handleRequest() {
        System.out.println("Your order has been delivered");
    }

    @Override
    public String toString() {
        return "DELIVERED";
    }
}
