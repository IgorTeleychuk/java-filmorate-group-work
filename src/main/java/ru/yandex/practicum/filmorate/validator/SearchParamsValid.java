package ru.yandex.practicum.filmorate.validator;

import ru.yandex.practicum.filmorate.validator.impl.SearchParamsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SearchParamsValidator.class)
public @interface SearchParamsValid {

    String message() default "Invalid search params";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
