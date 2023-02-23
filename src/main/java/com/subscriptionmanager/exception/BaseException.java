package com.subscriptionmanager.exception;

import com.subscriptionmanager.enums.ExceptionCode;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {

  private final String detailedMessage;

  private ExceptionCode errorCode;

  public BaseException(final String message, final ExceptionCode code) {
    super(message);
    this.detailedMessage = message;
    this.errorCode = code;
  }
}
