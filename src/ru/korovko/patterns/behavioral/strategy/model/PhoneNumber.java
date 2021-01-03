package ru.korovko.patterns.behavioral.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.korovko.patterns.behavioral.strategy.validation.PhoneNumberValidator;

@AllArgsConstructor
@Setter
@Getter
public class PhoneNumber {

    private String number;
    private PhoneNumberValidator validator;

    public boolean isValid() {
        return validator.isValid(this);
    }
}
