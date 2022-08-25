package com.codingchallenges.nagesh;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.*;

import java.io.IOException;

public class SendGridEmailer {

    public static void main(String[] args) throws IOException {

        Email from = new Email("rakesh.chavan776@gmail.com");
        String email[] = {"suchitkhadtar12@gmail.com", "rac16021999@gmail.com", "raj.bokade@crossasyst.com"};
        for (int i = 0; i <= email.length; i++) {
            Email to = new Email(email[i]); // use your own email address here
            String subject = "Sending with Twilio SendGrid is Fun";
            Content content = new Content("text/html", "Hi Suchit, This message is from Twilio.");
            Mail mail = new Mail(from, subject, to, content);

            SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
            Request request = new Request();

            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sg.api(request);

            System.out.println(response.getStatusCode());
            System.out.println(response.getHeaders());
            System.out.println(response.getBody());
        }
    }
}
