package pl.coderslab.week4.spy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {


    @Test
    void shouldNotifyUserBySendEmail(){
        NotificationService spyNotificationService = spy(NotificationService.class);

        spyNotificationService.notifyUser("1","Test");
        verify(spyNotificationService).sendEmail("1@example.com","Test");
    }
}