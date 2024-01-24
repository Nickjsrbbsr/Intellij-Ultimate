package com.example.demo.myanno.validation;

import com.example.demo.myanno.EvenOddValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EvenOddValidator implements ConstraintValidator<EvenOddValidation,Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer % 2==0 ;
    }
}
