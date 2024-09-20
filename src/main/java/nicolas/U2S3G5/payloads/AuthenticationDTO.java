package nicolas.U2S3G5.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AuthenticationDTO(
        @NotNull(message = "Email is required")
        @Email(message = "The provided email is not valid")
        String email,

        @NotNull(message = "Password is required")
        @Size(min = 10, max = 20, message = "Password must be between 6 and 14 characters")
        String password
) {}
