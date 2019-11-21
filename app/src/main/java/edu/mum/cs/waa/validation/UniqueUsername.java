package edu.mum.cs.waa.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueUsernameValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueUsername {
    String message() default "{edu.mum.cs.waa.validation.UniqueUsername}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
