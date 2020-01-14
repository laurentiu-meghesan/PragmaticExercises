package functions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatingInputs {

    private static class Class {

        boolean flag, flag1, flag2, flag3;

        private void validateName(String name) {
            if (name.length() == 1) {
                System.out.println("\"" + name + "\" is not a valid name. It is too short.");
                flag1 = true;
            } else if (name.length() == 0) {
                System.out.println("The name must be filled in.");
                flag1 = true;
            } else {
                flag = true;
            }
        }

        private void validateZip(String zip) {
            for (char ch : zip.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    System.out.println("The ZIP code must be numeric.");
                    break;
                } else {
                    flag2 = true;
                }
            }
        }

        private void validateID(String ID) {
            char[] ch = ID.toCharArray();
            if (ch.length != 7) {
                System.out.println(ID + " is not a valid ID.");
            } else {
                if (Character.isAlphabetic(ch[0]) & Character.isAlphabetic(ch[1])) {
                    if (Pattern.matches(String.valueOf(ch[2]), "-")) {
                        for (int i = 3; i <= 6; i++) {
                            if (!Character.isDigit(ch[i])) {
                                System.out.println(ID + " is not a valid ID.");
                                break;
                            } else {
                                flag3 = true;
                            }
                        }
                    } else {
                        System.out.println(ID + " is not a valid ID.");
                    }
                } else {
                    System.out.println(ID + " is not a valid ID.");
                }
            }
        }

        private void validateInput(Class check, String fistName, String lastName, String zipCode, String employeeID) {
            check.validateName(fistName);
            check.validateName(lastName);
            check.validateZip(zipCode);
            check.validateID(employeeID);
            if (flag && !flag1 && flag2 && flag3) {
                System.out.println("There were no errors found.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the first name:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name:");
        Scanner scanner1 = new Scanner(System.in);
        String lastName = scanner1.nextLine();

        System.out.println("Enter the ZIP code:");
        Scanner scanner2 = new Scanner(System.in);
        String zipCode = scanner2.nextLine();

        System.out.println("Enter an employee ID:");
        Scanner scanner3 = new Scanner(System.in);
        String employeeID = scanner3.nextLine();

        Class check = new Class();
        check.validateInput(check, firstName, lastName, zipCode, employeeID);

    }

}
