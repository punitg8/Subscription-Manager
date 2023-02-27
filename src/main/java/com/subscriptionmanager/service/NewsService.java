package com.subscriptionmanager.service;

import com.subscriptionmanager.v1.proto.CreateNewsRequest;
import com.subscriptionmanager.v1.proto.News;

public interface NewsService {

  News createNews(CreateNewsRequest request);

}
