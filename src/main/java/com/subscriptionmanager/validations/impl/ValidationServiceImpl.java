package com.subscriptionmanager.validations.impl;

import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.validations.ValidationService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {

  private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private final Validator validator = factory.getValidator();

  @Override
  public <T> void validateObj(final T obj) {
    final Set<ConstraintViolation<T>> violations = validator.validate(obj);

    for (final ConstraintViolation<T> violation : violations) {

      throw InvalidArgumentException.builder()
          .violationMessage(violation.getMessage())
          .fieldValue(violation.getInvalidValue().toString())
          .build();

    }
  }

}
