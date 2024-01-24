package com.org.validation;
// EvenOddValidator.java


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class EvenOddValidator implements ConstraintValidator<EvenOddValidation, Integer> {

    @Override
    public void initialize(EvenOddValidation constraintAnnotation) {
        // Initialization, if needed
    }

//    @Override
//    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
//        return false;
//    }

    @Override
    public boolean isValid(Integer number, ConstraintValidatorContext context) {
        return number % 2 == 0;
    }
}
