package homework_13;

import homework_13.exceptions.WrongLoginException;
import homework_13.exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    static final int LOGIN_LENGTH = 20;
    static final int PASSWORD_LENGTH = 20;
    static final Pattern DIGIT_PATTERN = Pattern.compile("\\d+");

    public static boolean validateCredentials(String login, String password, String confirmPassword){
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error of validation: " + e.getMessage());
            return false;
        }
    }

    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null || password.length() >= PASSWORD_LENGTH) {
            throw new WrongPasswordException("Password must contains less than 20 symbols");
        }

        if (password.contains(" ")) {
            throw new WrongPasswordException("Password mustn't contains spaces");
        }

        Matcher matcherDigit = DIGIT_PATTERN.matcher(password);

        if (!matcherDigit.find()) {
            throw new WrongPasswordException("Password must contains 1 digit or more");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords must match");
        }
    }

    public static void validateLogin(String login) throws WrongLoginException {
        if (login == null || login.length() >= PASSWORD_LENGTH) {
            throw new WrongLoginException("Login must contains less than 20 symbols");
        }

        if (login.contains(" ")) {
            throw new WrongLoginException("Login mustn't contains spaces");
        }
    }
}
