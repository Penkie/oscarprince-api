package ch.oscarprince.api.controller;

import ch.oscarprince.api.dto.ContactMessage;
import ch.oscarprince.api.service.MailService;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final MailService mailService;
    private final Bucket bucket;

    public ContactController(MailService mailService) {
        this.mailService = mailService;
        Bandwidth limit = Bandwidth.classic(1, Refill.greedy(1, Duration.ofMinutes(1)));
        this.bucket = Bucket.builder()
                .addLimit(limit)
                .build();
    }

    @PostMapping()
    public ResponseEntity<String> SendContactMessage(@Valid @RequestBody ContactMessage message) {
        if (bucket.tryConsume(1)) {
            this.mailService.sendContactMessage(message.name, message.email, message.text);
            return ResponseEntity.status(HttpStatus.OK).build();
        }

        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build();
    }
}
