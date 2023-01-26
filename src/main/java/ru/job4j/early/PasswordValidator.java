package ru.job4j.early;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;


public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null.");
        }

        if (password.length() > 32 || password.length() < 12) {
            throw new IllegalArgumentException("Password should be length [8, 32].");
        }

        if (password.toLowerCase().equals(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter.");
        }

        if (password.toUpperCase().equals(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter.")
        }
        boolean digits = false;
        boolean specials = false;
        for (char ch : password.toCharArray()) {
            if (isDigit(ch)) {
                digits = true;
            } else if (!isLetterOrDigit(ch)) {
                specials = true;
            }
            if (digits && specials) {
                break;
            }
        }
    }
}