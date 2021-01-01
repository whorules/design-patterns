package ru.korovko.patterns.behavioral.command.execution;

import ru.korovko.patterns.behavioral.command.payment.PaymentHistory;
import ru.korovko.patterns.behavioral.command.payment.Payment;

public class CancelPaymentCommand implements Command {

    private final PaymentHistory paymentHistory = PaymentHistory.getInstance();

    @Override
    public void execute(Payment payment) {
        if (!paymentHistory.isEmpty()) {
            payment.cancelPayment();
            paymentHistory.remove();
        }
    }
}
