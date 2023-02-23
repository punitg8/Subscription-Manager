package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.Newsletter.NEWSLETTER_SUBJECT;

import com.subscription.proto.NewsletterMailInfo;
import com.subscriptionmanager.service.EmailService;
import com.subscriptionmanager.service.SendGridMailService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailServiceImpl implements EmailService {

  private final SendGridMailService mailService;

  @Value("${admin.emailId}")
  private String adminEmailId;

  @Override
  public void sendNewsletterEmail(NewsletterMailInfo info) {
    List<String> news = info.getNewsletter().getNewsList();

    info.getEmailIdList().stream().forEach(emailId->
        mailService.sendMail(adminEmailId,emailId,NEWSLETTER_SUBJECT,news.toString()));

  }

}
