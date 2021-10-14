package com.training.ee.rest.custom.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartWithCheckImpl implements ConstraintValidator<StartWith, String> {

    private StartWith an;

    @Override
    public void initialize(final StartWith an) {
        this.an = an;
    }

    @Override
    public boolean isValid(final String valueParam,
                           final ConstraintValidatorContext contextParam) {
        return valueParam.startsWith(this.an.value());
    }

}
