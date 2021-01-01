package ru.korovko.patterns.behavioral.command.execution;

import ru.korovko.patterns.behavioral.command.payment.PaymentHistory;
import ru.korovko.patterns.behavioral.command.payment.Payment;

public class PayCommand implements Command {

    private final PaymentHistory paymentHistory = PaymentHistory.getInstance();

    @Override
    public void execute(Payment payment) {
        payment.pay();
        paymentHistory.add(payment);
    }
}
