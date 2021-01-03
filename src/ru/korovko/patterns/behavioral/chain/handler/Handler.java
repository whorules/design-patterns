package ru.korovko.patterns.behavioral.chain.handler;

import lombok.Setter;
import ru.korovko.patterns.behavioral.chain.request.Request;

@Setter
public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest(Request request);
}

