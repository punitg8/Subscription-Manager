package com.subscriptionmanager.validations;

import java.util.Map;

public interface ValidationService {

  <T> void validateObj(T obj);

  int validateAndExtractPageSize(int pageSize, int minPageSize, int maxPageSize);

  int validateAndExtractPageToken(String pageToken);

  Map<String,String> validateAndExtractResourceValueMap(String fullResourceName, String ...resources);

}
