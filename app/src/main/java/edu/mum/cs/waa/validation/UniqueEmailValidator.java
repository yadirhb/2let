package edu.mum.cs.waa.validation;

import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private UserService userService;

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        User user = null;
        try {
            user = userService.getUserByEmail(value);
        } catch (Exception e) {
        }
        return user == null;
    }
}
