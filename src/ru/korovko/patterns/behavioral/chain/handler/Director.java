package ru.korovko.patterns.behavioral.chain.handler;

import ru.korovko.patterns.behavioral.chain.request.Request;
import ru.korovko.patterns.behavioral.chain.request.RequestType;

public class Director extends Handler {

    /**
     * Director can approve only conferences
     */
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director approved request: " + request);
        } else {
            successor.handleRequest(request);
        }
    }
}
