package ru.korovko.patterns.behavioral.state.states;

import ru.korovko.patterns.behavioral.state.order.Order;

public class AssemblyState extends State {

    public AssemblyState(Order order) {
        super(order);
        System.out.println("We are assembling you order...");
    }

    @Override
    public void handleRequest() {
        order.setCurrentState(new InDeliveryState(order));
    }

    @Override
    public String toString() {
        return "ASSEMBLY";
    }
}
