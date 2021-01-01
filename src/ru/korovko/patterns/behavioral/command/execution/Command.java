package ru.korovko.patterns.behavioral.command.execution;

import ru.korovko.patterns.behavioral.command.payment.Payment;

public interface Command {

    void execute(Payment payment);
}
