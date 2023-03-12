package com.subscriptionmanager.exception;

import com.subscriptionmanager.enums.ExceptionCode;
import java.io.Serial;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ResourceNotFoundException extends BaseException {

  @Serial
  private static final long serialVersionUID = 101;
  private final String resourceName;
  private final String fieldName;
  private final String fieldValue;

  @Builder
  public ResourceNotFoundException(
      final String resourceName,
      final String fieldName,
      final String fieldValue) {

    super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue),
        ExceptionCode.RESOURCE_NOT_FOUND);
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }

}
