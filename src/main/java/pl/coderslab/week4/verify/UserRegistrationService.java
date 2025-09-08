package pl.coderslab.week4.verify;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRegistrationService {
    private final EmailService emailService;

    public void registerUser(String userEmail){
        emailService.sendConfirmation(userEmail);
    }
}
