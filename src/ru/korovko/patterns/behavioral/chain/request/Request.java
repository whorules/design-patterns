package ru.korovko.patterns.behavioral.chain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Request {

    /**
     * Request type
     */
    private final RequestType requestType;
    /**
     * Amount of requests
     */
    private final double amount;
}
