package ch.oscarprince.api.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final JavaMailSender javaMailSender;

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendContactMessage(String name, String email, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("oscarprince@mg.budgetanalytics.app");
        message.setSubject("Contact depuis le site oscarprince.ch de la part de :" + name);
        message.setReplyTo(email);
        message.setTo("oscar@oscarprince.ch");
        message.setText(text);
        javaMailSender.send(message);
    }
}
