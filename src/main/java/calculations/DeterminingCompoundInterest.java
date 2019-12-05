package calculations;

import java.util.Scanner;

public class DeterminingCompoundInterest {

    public static void main(String[] args) {

        System.out.println("What is the principal amount? ");
        Scanner s1 = new Scanner(System.in);
        int pr = s1.nextInt();
        System.out.println("What is the rate? ");
        Scanner s2 = new Scanner(System.in);
        double rate = s2.nextDouble();
        System.out.println("What is the number of years? ");
        Scanner s3 = new Scanner(System.in);
        int years = s3.nextInt();
        System.out.println("What is the number of times the " +
                "interest is compounded per year? ");
        Scanner s4 = new Scanner(System.in);
        int nrTimes = s3.nextInt();

        double a = pr * Math.pow(1 + ((rate / 100) / nrTimes),(nrTimes*years));
        double b = Math.ceil(a*100)/100;

        System.out.println(pr+" invested at "+rate+"% for "+years+" " +
                "years compounded "+nrTimes+" times per year is $"+b+".");
    }
}
