package repetition;

import java.util.Scanner;

public class AddingNumbers {
    private int invalidAttempts = 0;

    private int getInvalidAttempts() {
        return invalidAttempts;
    }

    private int method() {

        try {
            System.out.println("Enter a number:");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception e) {
            invalidAttempts = invalidAttempts + 1;
            return 0;
        }
    }

    public static void main(String[] args) {
        int total = 0;
        System.out.println("Enter how many numbers you want to add:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        AddingNumbers add = new AddingNumbers();
        for (int i = 1; i <= n; i++) {
            total += add.method();

        }

        System.out.println("The total is " + total + ". Invalid attempts are " + add.getInvalidAttempts() + ".");
    }
}
