package com.pack.myanno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import com.pack.myanno.validation.EvenOddValidator;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.ANNOTATION_TYPE,ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.PARAMETER,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EvenOddValidator.class)
public @interface EvenOddValidation {
    String message() default "Number must be even bro !!!!!"; //Provides a default error message in case the validation fails.
    Class<?>[] groups() default {}; // Allows the annotation to be part of validation groups.
    Class<? extends     Payload>[] payload() default {};// Provides additional information about the annotation.
}
