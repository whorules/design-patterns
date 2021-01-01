package ru.korovko.patterns.behavioral.command.payment;

public class OnlineWalletPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("You've payed by online wallet");
    }

    @Override
    public void cancelPayment() {
        System.out.println("You've canceled payment by online wallet");
    }
}
