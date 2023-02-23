package com.subscriptionmanager.service;

import com.subscription.proto.NewsletterMailInfo;

public interface EmailService {

  void sendNewsletterEmail(NewsletterMailInfo info);

}
