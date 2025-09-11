package pl.coderslab.week5.tdd;

import java.util.regex.Pattern;

public class PasswordUtils {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{10,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public boolean validatePasswordStrength(String password) {
        return pattern.matcher(password).matches();
    }
}
