package ru.korovko.patterns.behavioral.chain;

import ru.korovko.patterns.behavioral.chain.handler.ChiefExecutiveOfficer;
import ru.korovko.patterns.behavioral.chain.handler.Director;
import ru.korovko.patterns.behavioral.chain.handler.VicePresident;
import ru.korovko.patterns.behavioral.chain.request.Request;
import ru.korovko.patterns.behavioral.chain.request.RequestType;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 1);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);
    }
}
