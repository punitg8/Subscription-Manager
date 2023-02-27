package com.subscriptionmanager.service.impl;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.subscriptionmanager.service.SendGridMailService;
import com.subscriptionmanager.v1.proto.Newsletter;
import com.subscriptionmanager.v1.proto.NewsletterMailInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
class EmailServiceImplTest {

  @Mock
  SendGridMailService mailService;

  @InjectMocks
  EmailServiceImpl emailService;

  @Test
  void testSendNewsletterEmail() {
    emailService.setAdminEmailId("Any valid email id");

    NewsletterMailInfo info = NewsletterMailInfo.newBuilder()
        .setNewsletter(Newsletter.newBuilder()
            .addAllNews(Arrays.asList("News 1", "News 2"))
            .build()
        )
        .addAllEmailId(Arrays.asList("Email 1", "Email 2"))
        .build();

    doNothing().when(mailService)
        .sendMail(isA(String.class), isA(String.class), isA(String.class), isA(String.class));

    emailService.sendNewsletterEmail(info);

    verify(mailService, times(2))
        .sendMail(isA(String.class), isA(String.class), isA(String.class), isA(String.class));
  }

}