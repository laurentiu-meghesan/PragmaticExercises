package functions;

import java.lang.Math;
import java.util.Scanner;

public class MonthsToPayOffACreditCard {

    static class Class1 {
        double calculateMonthsUntilPaidOff(double balance, int APR, double monthlyPayment) {
            double i = APR / 100.0 / 365;
            double logBase10 = Math.log(1 + i);
            double logBase = Math.log(1 + (balance / monthlyPayment) * (1 - (Math.pow((1 + i), 30))));

            return Math.ceil(((-(1 / 30.00)) * (logBase / logBase10)));
        }
    }


    public static void main(String[] args) {
        System.out.println("What is your balance?");
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the APR on the card (as a percent)?");
        Scanner scanner1 = new Scanner(System.in);
        int APR = scanner1.nextInt();
        scanner1.nextLine();

        System.out.println("What is the monthly payment you can make?");
        Scanner scanner2 = new Scanner(System.in);
        double monthlyPayment = scanner2.nextInt();
        scanner2.nextLine();

        Class1 class1 = new Class1();

        System.out.println("It will take you " + class1.calculateMonthsUntilPaidOff(balance, APR, monthlyPayment)
                + " months to pay off this card.");

    }
}
