package ru.korovko.patterns.behavioral.state.states;

import ru.korovko.patterns.behavioral.state.order.Order;

public abstract class State {

    protected Order order;

    public State(Order order) {
        this.order = order;
    }

    public abstract void handleRequest();
}
