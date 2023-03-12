package com.subscriptionmanager.exception;

import com.subscriptionmanager.enums.ExceptionCode;
import java.io.Serial;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 101;

  private final String detailedMessage;

  private ExceptionCode errorCode;

  public BaseException(final String message, final ExceptionCode code) {
    super(message);
    this.detailedMessage = message;
    this.errorCode = code;
  }

}
