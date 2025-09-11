package pl.coderslab.week5.tdd;

import java.util.regex.Pattern;

public class UserValidator {

    public boolean isValid(UserForUserValidator user) {
        String email = user.getEmail();
        int nameLength = user.getName().length();
        int passwordLength = user.getPassword().length();
        String emailPattern = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        return (nameLength > 3 && Pattern.matches(emailPattern, email) && passwordLength >= 8);
    }
}
