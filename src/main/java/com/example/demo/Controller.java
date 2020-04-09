package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;


@RestController
public class Controller {

    @Autowired
    private MailSenderConfiger smtpMailSender;

    @RequestMapping("/")
    public String sendMail() throws MessagingException {

        return smtpMailSender.send("ah.jr22@gmail.com", "Test mail from Spring", "Howdy");

    }

}
