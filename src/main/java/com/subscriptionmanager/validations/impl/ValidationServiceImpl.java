package com.subscriptionmanager.validations.impl;

import static com.subscriptionmanager.constants.ExceptionMessage.NEGATIVE_PAGE_SIZE_EXCEPTION;
import static com.subscriptionmanager.constants.ExceptionMessage.NEGATIVE_PAGE_TOKEN_EXCEPTION;
import static com.subscriptionmanager.constants.ExceptionMessage.NON_NUMERIC_PAGE_TOKEN_EXCEPTION;
import static com.subscriptionmanager.constants.ExceptionMessage.RESOURCE_NAME_PARSING_EXCEPTION;

import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.validations.ValidationService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.HashMap;
import java.util.Map;
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

  @Override
  public int validateAndExtractPageSize(
      final int pageSize,
      final int minPageSize,
      final int maxPageSize) {

    if (pageSize < 0) {
      throw InvalidArgumentException.builder()
          .violationMessage(NEGATIVE_PAGE_SIZE_EXCEPTION)
          .fieldValue(String.valueOf(pageSize))
          .build();
    } else if (pageSize < minPageSize) {
      return minPageSize;
    } else if (pageSize > maxPageSize) {
      return maxPageSize;
    }
    return pageSize;
  }

  @Override
  public int validateAndExtractPageToken(final String pageTokenString) {
    int pageToken;

    try {

      if ("".equals(pageTokenString)) {
        pageToken = 0;
      } else {
        pageToken = Integer.parseInt(pageTokenString);
      }

    } catch (Exception exception) {
      throw InvalidArgumentException.builder()
          .violationMessage(NON_NUMERIC_PAGE_TOKEN_EXCEPTION)
          .fieldValue(pageTokenString)
          .build();
    }

    if (pageToken < 0) {
      throw InvalidArgumentException.builder()
          .violationMessage(NEGATIVE_PAGE_TOKEN_EXCEPTION)
          .fieldValue(String.valueOf(pageToken))
          .build();
    }

    return pageToken;
  }

  @Override
  public Map<String, String> validateAndExtractResourceValueMap(
      final String fullResourceName, final String... resources) {

    final String[] resourceValueList = fullResourceName.split("/");

    if (resourceValueList.length != resources.length * 2) {
      throw InvalidArgumentException.builder()
          .violationMessage(RESOURCE_NAME_PARSING_EXCEPTION)
          .fieldValue(fullResourceName)
          .build();
    }

    final Map<String, String> resourceValueMapping = new HashMap<>();

    for (int i = 0; i < resourceValueList.length; i += 2) {

      if (!resourceValueList[i].equals(resources[i / 2])) {
        throw InvalidArgumentException.builder()
            .violationMessage(RESOURCE_NAME_PARSING_EXCEPTION)
            .fieldValue(fullResourceName)
            .build();
      }

      resourceValueMapping.put(resourceValueList[i], resourceValueList[i + 1]);
    }

    return resourceValueMapping;
  }

}
