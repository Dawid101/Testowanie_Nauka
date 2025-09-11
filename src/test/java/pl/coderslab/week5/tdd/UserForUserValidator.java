package pl.coderslab.week5.tdd;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForUserValidator {
    private String name;
    private String password;
    private String email;

    public UserForUserValidator(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
