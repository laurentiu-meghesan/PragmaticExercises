package MakingDecisions;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Enter the second number:");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Enter the third number:");
        Scanner sc3 = new Scanner(System.in);
        int c = sc1.nextInt();

        if (a == b | a == c | b == c) {
            System.out.println("The numbers you entered are the same. Program terminates.");
            return;
        }

        if (a > b) {
            if (a > c) {
                System.out.println("The largest numbers is " + a + ".");
            } else
                System.out.println("The largest numbers is " + c + ".");
        } else if (b > c) {
            System.out.println("The largest numbers is " + b + ".");
        }else
            System.out.println("The largest numbers is " + c + ".");

    }
}
