package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Component
public class MailSenderConfiger {

    @Autowired
    private JavaMailSender javaMailSender;


    public String send(String to, String subject, String body) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        helper = new MimeMessageHelper(message, true);
        helper.setSubject(subject);
        helper.setTo(to);
        helper.setText(body, true);
        javaMailSender.send(message);
        return "Sent massage !";
    }


}
