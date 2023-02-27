package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.Newsletter.NEWSLETTER_SUBJECT;

import com.subscriptionmanager.service.EmailService;
import com.subscriptionmanager.service.SendGridMailService;
import com.subscriptionmanager.v1.proto.NewsletterMailInfo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Setter
@Service
public class EmailServiceImpl implements EmailService {

  private final SendGridMailService mailService;

  @Value("${admin.emailId}")
  private String adminEmailId;

  @Override
  public void sendNewsletterEmail(final NewsletterMailInfo info) {
    final List<String> news = info.getNewsletter().getNewsList();

    info.getEmailIdList().stream().forEach(emailId ->
        mailService.sendMail(adminEmailId, emailId, NEWSLETTER_SUBJECT, news.toString()));

  }

}
