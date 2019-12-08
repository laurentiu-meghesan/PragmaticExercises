package MakingDecisions;

import java.util.Scanner;

public class MultistateSalesTaxCalc {

    public static void main(String[] args) {

        System.out.println("What is the order amount?");
        Scanner sc1 = new Scanner(System.in);
        double order = sc1.nextDouble();
        System.out.println("What state do you live in?");
        Scanner sc2 = new Scanner(System.in);
        String state = sc2.nextLine();
        double taxWIEau = order * 5 / 100;
        double taxWIDunn = order * 4 / 100;
        double taxIl = order * 8 / 100;
        double sumIl = order + taxIl;
        double sumWIEau = order + taxWIEau;
        double sumWIDunn = order + taxWIDunn;
        double s3 = Math.ceil(sumWIDunn * 100) / 100;
        double s1 = Math.ceil(sumWIEau * 100) / 100;
        double s2 = Math.ceil(sumIl * 100) / 100;

        if (state.equals("Wisconsin")) {
            System.out.println("If you are from Eau Claire area, then press 1. " + '\n' +
                    "If you are from Dunn area, then press 2.");
            Scanner s4 = new Scanner(System.in);
            int m = s4.nextInt();

            if (m == 1) {
                System.out.println("The tax is $" + taxWIEau);
                System.out.println("The total is $" + (order + taxWIEau));
            } else if (m == 2) {
                System.out.println("The tax is $" + taxWIDunn);
                System.out.println("The total is $" + (order + taxWIDunn));
            }

        } else if (state.equals("Illinois")) {
            System.out.println("The tax is $" + taxIl);
            System.out.println("The total is $" + (order + taxIl));
        }
    }
}
