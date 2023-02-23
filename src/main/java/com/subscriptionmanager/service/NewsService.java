package com.subscriptionmanager.service;

import com.subscription.proto.CreateNewsRequest;
import com.subscription.proto.News;

public interface NewsService {

  News createNews(CreateNewsRequest request);

}
