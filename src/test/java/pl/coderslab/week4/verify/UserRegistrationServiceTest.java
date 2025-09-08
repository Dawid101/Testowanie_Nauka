package pl.coderslab.week4.verify;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class UserRegistrationServiceTest {

    @Test
    void testCorrectEmailSent() {
        EmailService mockEmailService = mock(EmailService.class);
        UserRegistrationService userRegistrationService = new UserRegistrationService(mockEmailService);
        String email = "johnDoe@gmail.com";
        userRegistrationService.registerUser(email);

        verify(mockEmailService).sendConfirmation(email);
    }

}