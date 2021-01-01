package ru.korovko.patterns.behavioral.chain.handler;

import ru.korovko.patterns.behavioral.chain.request.Request;

public class ChiefExecutiveOfficer extends Handler {

    /**
     * CEO and approve anything he wants
     */
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO approved request: " + request);
    }
}
