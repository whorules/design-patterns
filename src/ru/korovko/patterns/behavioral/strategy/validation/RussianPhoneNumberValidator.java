package ru.korovko.patterns.behavioral.strategy.validation;

import ru.korovko.patterns.behavioral.strategy.model.PhoneNumber;

public class RussianPhoneNumberValidator extends PhoneNumberValidator {

    /**
     * Russian phone number should start with +7 and contain 10 digits after it.
     * For example: +79503651478
     */
    @Override
    public boolean isValid(PhoneNumber phoneNumber) {
        String number = phoneNumber.getNumber();
        return isPhoneNumber(number) && number.startsWith("+7") && number.length() == 12;
    }
}
