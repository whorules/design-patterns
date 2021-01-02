package ru.korovko.patterns.behavioral.strategy.validation;

import ru.korovko.patterns.behavioral.strategy.model.PhoneNumber;

public abstract class PhoneNumberValidator {

    public abstract boolean isValid(PhoneNumber phoneNumber);

    /**
     * General validator for phone numbers. Assume that any phone number should start with "+" and contain at least 11 digits
     */
    public boolean isPhoneNumber(String phoneNumber) {
        if (!phoneNumber.startsWith("+") || phoneNumber.length() < 12) {
            return false;
        }
        char[] phoneWithoutPlus = phoneNumber.substring(1).toCharArray();
        for (char currentSymbol : phoneWithoutPlus) {
            if (!Character.isDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }
}
