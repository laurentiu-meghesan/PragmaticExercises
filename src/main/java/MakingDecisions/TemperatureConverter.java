package MakingDecisions;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celcius to Fahrenheit.");
        Scanner sc1 = new Scanner(System.in);
        String a = sc1.nextLine();
        System.out.println("Your choice: " + a + ".");

        if (a.equals("c") | a.equals("C")) {

            System.out.println("Please enter the temperature in Fahrenheit: ");
            Scanner sc2 = new Scanner(System.in);
            int x = sc2.nextInt();
            double C = (x - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + C);
        } else if (a.equals("f") | a.equals("F")) {

            System.out.println("Please enter the temperature in Celsius: ");
            Scanner sc2 = new Scanner(System.in);
            int x = sc2.nextInt();
            double F = (x * 9 / 5) + 32;
            System.out.println("The temperature in Celsius is " + F);
        } else {
            System.out.println("Please chose between C and F!");
        }


    }
}
