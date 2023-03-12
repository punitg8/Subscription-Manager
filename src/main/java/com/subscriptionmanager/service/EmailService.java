package com.subscriptionmanager.service;


import com.subscriptionmanager.v1.proto.NewsletterMailInfo;

public interface EmailService {

  void sendNewsletterEmail(NewsletterMailInfo info);

}
