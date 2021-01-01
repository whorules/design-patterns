package ru.korovko.patterns.behavioral.command.payment;

import java.util.LinkedList;
import java.util.Queue;

public class PaymentHistory {

    private static PaymentHistory paymentHistory;
    private final Queue<Payment> history = new LinkedList<>();

    private PaymentHistory() {}

    public static PaymentHistory getInstance() {
        if (paymentHistory == null) {
            paymentHistory = new PaymentHistory();
        }
        return paymentHistory;
    }

    public void add(Payment payment) {
        history.add(payment);
    }

    public void remove() {
        history.poll();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
