package ru.korovko.patterns.behavioral.state.order;

import ru.korovko.patterns.behavioral.state.states.DraftState;
import ru.korovko.patterns.behavioral.state.states.State;

public class Order {

    private State currentState;

    public Order() {
        this.currentState = new DraftState(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void process() {
        currentState.handleRequest();
    }
}
