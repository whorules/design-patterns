package ru.korovko.patterns.behavioral.state.states;

import ru.korovko.patterns.behavioral.state.order.Order;

public class InDeliveryState extends State {

    public InDeliveryState(Order order) {
        super(order);
        System.out.println("You order is in delivery");
    }

    @Override
    public void handleRequest() {
        order.setState(new DeliveredState(order));
    }

    @Override
    public String toString() {
        return "IN DELIVERY";
    }
}
