package ru.korovko.patterns.behavioral.strategy.validation;

import ru.korovko.patterns.behavioral.strategy.model.PhoneNumber;

public class UkrainianPhoneNumberValidator extends PhoneNumberValidator {

    /**
     * Ukrainian phone number should start with +380 and contain 9 digits after it.
     * For example: +380671201358
     */
    @Override
    public boolean isValid(PhoneNumber phoneNumber) {
        String number = phoneNumber.getNumber();
        return isPhoneNumber(number) && number.startsWith("+380") && number.length() == 13;
    }
}
