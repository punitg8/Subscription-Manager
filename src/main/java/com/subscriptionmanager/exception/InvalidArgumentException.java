package com.subscriptionmanager.exception;

import com.subscriptionmanager.enums.ExceptionCode;
import java.io.Serial;
import lombok.Builder;
import lombok.Getter;

@Getter
public class InvalidArgumentException extends BaseException {

  @Serial
  private static final long serialVersionUID = 101;
  private final String violationMessage;
  private final String fieldValue;

  @Builder
  public InvalidArgumentException(
      final String violationMessage,
      final String fieldValue) {

    super(String.format("%1$s, value : %2$s", violationMessage, fieldValue),
        ExceptionCode.INVALID_ARGUMENT);
    this.violationMessage = violationMessage;
    this.fieldValue = fieldValue;
  }

}
