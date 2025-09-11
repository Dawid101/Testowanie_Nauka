package pl.coderslab.week5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {

    @Test
    void shouldReturnFalseWhenNameTooShort(){
        UserValidator userValidator = new UserValidator();
        UserForUserValidator user = new UserForUserValidator("Da","12345678","dawid@gmail.com");
        assertFalse(userValidator.isValid(user));
    }

    @Test
    void shouldReturnFalseWhenPasswordTooShort(){
        UserValidator userValidator = new UserValidator();
        UserForUserValidator user = new UserForUserValidator("Dawid","123456","dawid@gmail.com");
        assertFalse(userValidator.isValid(user));
    }

    @Test
    void shouldReturnFalseWhenEmailIsNotCorrect(){
        UserValidator userValidator = new UserValidator();
        UserForUserValidator user = new UserForUserValidator("Dawid","12345678","dawidgmail.com");
        assertFalse(userValidator.isValid(user));
    }

    @Test
    void shouldReturnTrueIfEverythingIsGood(){
        UserValidator userValidator = new UserValidator();
        UserForUserValidator user = new UserForUserValidator("Dawid","12345678","dawid@gmail.com");
        assertTrue(userValidator.isValid(user));
    }
}
