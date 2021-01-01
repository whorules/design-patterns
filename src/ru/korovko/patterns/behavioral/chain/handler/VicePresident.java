package ru.korovko.patterns.behavioral.chain.handler;

import ru.korovko.patterns.behavioral.chain.request.Request;
import ru.korovko.patterns.behavioral.chain.request.RequestType;

public class VicePresident extends Handler {

    /**
     * Vice president can approve purchases below 1500
     */
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("Vice president approved request: " + request);
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
