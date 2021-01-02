package ru.korovko.patterns.behavioral.strategy;

import ru.korovko.patterns.behavioral.strategy.model.PhoneNumber;
import ru.korovko.patterns.behavioral.strategy.validation.RussianPhoneNumberValidator;
import ru.korovko.patterns.behavioral.strategy.validation.UkrainianPhoneNumberValidator;

public class Main {

    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber("+78124563651", new RussianPhoneNumberValidator());
        System.out.println("The number " + number.getNumber() + " is russian number: " + number.isValid()); // correct number, prints true
        number.setNumber("+380314568432");
        System.out.println("The number " + number.getNumber() + " is russian number: " + number.isValid()); // incorrect format, prints false
        number.setValidator(new UkrainianPhoneNumberValidator());
        System.out.println("The number " + number.getNumber() + " is ukrainian number: " + number.isValid()); // prints true
    }
}
