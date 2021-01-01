package ru.korovko.patterns.behavioral.command;

import ru.korovko.patterns.behavioral.command.execution.CancelPaymentCommand;
import ru.korovko.patterns.behavioral.command.execution.Command;
import ru.korovko.patterns.behavioral.command.execution.PayCommand;
import ru.korovko.patterns.behavioral.command.payment.CardPayment;
import ru.korovko.patterns.behavioral.command.payment.CashPayment;
import ru.korovko.patterns.behavioral.command.payment.OnlineWalletPayment;
import ru.korovko.patterns.behavioral.command.payment.Payment;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Payment> payments = List.of(new CardPayment(), new CashPayment(), new OnlineWalletPayment());

        Command paymentCommand = new PayCommand();
        payments.forEach(paymentCommand::execute);

        Command cancelPaymentsCommand = new CancelPaymentCommand();
        payments.forEach(cancelPaymentsCommand::execute);
    }
}
