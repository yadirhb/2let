package edu.mum.cs.waa.helpers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ValidationAssistant {

    @ExceptionHandler(ConstraintViolationException.class)
    protected List<ConstraintViolation> handleConstraintViolationException(ConstraintViolationException exception, WebRequest request) {
        List<ConstraintViolation> errors = new ArrayList<>(exception.getConstraintViolations());

        return errors;
    }
}
