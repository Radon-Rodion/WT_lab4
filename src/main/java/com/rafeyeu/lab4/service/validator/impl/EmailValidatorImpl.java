package com.rafeyeu.lab4.service.validator.impl;

import com.rafeyeu.lab4.service.validator.AbstractValidator;

public class EmailValidatorImpl extends AbstractValidator {
    private static final String EMAIL_REGEX = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

    @Override
    protected String getRegex() {
        return EMAIL_REGEX;
    }
}