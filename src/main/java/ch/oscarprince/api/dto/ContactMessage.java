package ch.oscarprince.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class ContactMessage {

    @NotNull(message = "Name must not be null")
    public String name;

    @Email(message = "Email must be an email")
    @NotNull(message = "Email must exist")
    public String email;

    @NotNull(message = "Text must be not empty")
    public String text;
}
