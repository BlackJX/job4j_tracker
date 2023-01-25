package ru.job4j.early;

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
    }
}