package ru.korovko.patterns.behavioral.chain.handler;

import ru.korovko.patterns.behavioral.chain.request.Request;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}

