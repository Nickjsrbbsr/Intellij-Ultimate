package com.pack.myanno.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.pack.myanno.EvenOddValidation;

public class EvenOddValidator implements ConstraintValidator<EvenOddValidation,Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer % 2==0 ;
    }
}
