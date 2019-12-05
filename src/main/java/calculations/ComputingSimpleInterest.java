package calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {

    public static void main(String[] args) {

        System.out.println("Enter the principal: ");
        Scanner s1 = new Scanner(System.in);
        int pr = s1.nextInt();
        System.out.println("Enter the rate of interest: ");
        Scanner s2 = new Scanner(System.in);
        double rate = s2.nextDouble();
        System.out.println("Enter the numbers of years:");
        Scanner s3 = new Scanner(System.in);
        int years = s3.nextInt();

        double a = pr * (1 + ((rate / 100) * years));
        double b = Math.ceil(a*100)/100;

        System.out.println("After " + years + " years at " + rate +
                "%, the investment will be worth $" + b + ".");
    }
}
