package ru.korovko.patterns.behavioral.chain.request;

public class Request {

    /**
     * Request type
     */
    private final RequestType requestType;
    /**
     * Amount of requests
     */
    private final double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType=" + requestType +
                ", amount=" + amount +
                '}';
    }
}
