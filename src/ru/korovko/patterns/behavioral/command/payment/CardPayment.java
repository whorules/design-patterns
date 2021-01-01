package ru.korovko.patterns.behavioral.command.payment;

public class CardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("You've payed by plastic card");
    }

    @Override
    public void cancelPayment() {
        System.out.println("You've canceled payment by plastic card");
    }
}
