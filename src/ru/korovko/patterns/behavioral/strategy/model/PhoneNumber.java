package ru.korovko.patterns.behavioral.strategy.model;

import ru.korovko.patterns.behavioral.strategy.validation.PhoneNumberValidator;

public class PhoneNumber {

    private String number;
    private PhoneNumberValidator validator;

    public PhoneNumber(String number, PhoneNumberValidator validator) {
        this.number = number;
        this.validator = validator;
    }

    public boolean isValid() {
        return validator.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setValidator(PhoneNumberValidator validator) {
        this.validator = validator;
    }
}
