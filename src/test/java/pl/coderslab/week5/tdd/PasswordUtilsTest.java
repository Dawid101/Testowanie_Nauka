package pl.coderslab.week5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordUtilsTest {
    @Test
    void shouldReturnFalseWhenPasswordIsTooShort() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("short"));
    }

    @Test
    void shouldReturnFalseWhenPasswordDoesNotContainUppercaseLetter() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("password1"));
    }


    @Test
    void shouldReturnFalseWhenPasswordDoesNotContainLowercaseLetter() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("PASSWORD1"));
    }


    @Test
    void shouldReturnFalseWhenPasswordDoesNotContainDigit() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("Password"));
    }


    @Test
    void shouldReturnFalseWhenPasswordDoesNotContainSpecialCharacter() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("Password1"));
    }


    @Test
    void shouldReturnTrueWhenPasswordIsStrong() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertTrue(passwordUtils.validatePasswordStrength("Password1!"));
    }
}
