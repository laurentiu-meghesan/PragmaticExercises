package functions;

import java.util.Scanner;

public class PasswordStrengthIndicator {

    static class PassCheck {

        boolean containNumbers(String password) {
            boolean flag = false;
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    return flag = true;
                } else flag = false;
            }
            return flag;
        }

        boolean isFewerThanEightChars(String password) {
            boolean flag = false;
            if (password.length() < 8) {
                return true;
            }
            return flag;
        }

        boolean containLetters(String password) {
            boolean flag = false;
            for (char ch : password.toCharArray()) {
                if (Character.isAlphabetic(ch)) {
                    return flag = true;
                } else flag = false;
            }
            return flag;
        }

        boolean containSpecialChars(String password) {
            boolean flag = false;
            for (char ch : password.toCharArray()) {
                if (!Character.isAlphabetic(ch) & !Character.isDigit(ch)) {
                    return flag = true;
                } else flag = false;
            }
            return flag;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the password:");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        PassCheck check = new PassCheck();

        String string = null;

        if (check.containLetters(password) & check.containNumbers(password) & check.containSpecialChars(password) &
                !check.isFewerThanEightChars(password)) {
            string = "very strong password.";
        } else if (check.containLetters(password) & check.containNumbers(password) & !check.isFewerThanEightChars(password)) {
            string = "strong password";
        } else if (check.containLetters(password) & !check.containNumbers(password) & !check.containSpecialChars(password)
                & check.isFewerThanEightChars(password)) {
            string = "weak password.";
        } else if (check.containNumbers(password) & check.isFewerThanEightChars(password) & !check.containLetters(password)
                & !check.containSpecialChars(password)) {
            string = "very weak password.";
        } else if (check.isFewerThanEightChars(password)) {
            string = "very weak password.";
        } else if (check.containLetters(password) & !check.isFewerThanEightChars(password)) {
            string = "weak password.";
        } else if (check.containNumbers(password) & !check.isFewerThanEightChars(password)) {
            string = "weak password.";
        }

        System.out.println("The password '" + password + "' is a " + string);
    }
}

