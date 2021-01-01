package ru.korovko.patterns.behavioral.command.payment;

public class CashPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("You've payed by cash");
    }

    @Override
    public void cancelPayment() {
        System.out.println("You've canceled payment by cash");
    }
}
