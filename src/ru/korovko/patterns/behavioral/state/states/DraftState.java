package ru.korovko.patterns.behavioral.state.states;

import ru.korovko.patterns.behavioral.state.order.Order;

public class DraftState extends State {

    public DraftState(Order order) {
        super(order);
        System.out.println("You've created new order. Now it's in draft state");
    }

    @Override
    public void handleRequest() {
        order.setState(new AssemblyState(order));
    }

    @Override
    public String toString() {
        return "DRAFT";
    }
}
