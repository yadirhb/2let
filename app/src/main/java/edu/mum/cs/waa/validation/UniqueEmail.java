package edu.mum.cs.waa.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {
    String message() default "{edu.mum.cs.waa.validation.UniqueEmail}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
