package ru.korovko.patterns.behavioral.state.order;

import lombok.Getter;
import lombok.Setter;
import ru.korovko.patterns.behavioral.state.states.DraftState;
import ru.korovko.patterns.behavioral.state.states.State;

@Getter
@Setter
public class Order {

    private State currentState;

    public Order() {
        this.currentState = new DraftState(this);
    }

    public void process() {
        currentState.handleRequest();
    }
}
