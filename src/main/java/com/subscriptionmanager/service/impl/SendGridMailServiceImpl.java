package com.subscriptionmanager.service.impl;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.subscriptionmanager.service.SendGridMailService;
import java.io.IOException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class SendGridMailServiceImpl implements SendGridMailService {

  @Value("${sendgrid.api-key}")
  private String apiKey;

  @Override
  public void sendMail(String from, String to, String subject, String content) {
    Mail mail = new Mail(new Email(from),
        subject,
        new Email(to),
        new Content("text/plain", content));
    SendGrid sg = new SendGrid(apiKey);
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      log.info(response.getStatusCode() + " To:" + to);
    } catch (Exception exception) {
      log.error(exception.getMessage());
    }
  }

}
