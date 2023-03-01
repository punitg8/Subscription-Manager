package com.subscriptionmanager.validations;

public interface ValidationService {

  <T> void validateObj(T obj);

  int validateAndExtractPageSize(int pageSize,int minPageSize,int maxPageSize);

  int validateAndExtractPageToken(String pageToken);

}
