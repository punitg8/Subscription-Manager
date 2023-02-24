package com.subscriptionmanager.service;

public interface SendGridMailService {

  void sendMail(String from, String to, String subject, String body);

}
