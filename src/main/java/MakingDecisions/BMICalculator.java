package MakingDecisions;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        System.out.println("Please enter your height in inches:");
        Scanner sc1 = new Scanner(System.in);
        double height = sc1.nextDouble();

        System.out.println("Please enter your weight in pounds:");
        Scanner sc2 = new Scanner(System.in);
        double weight = sc2.nextDouble();

        double bmi = (weight / (height * height)) * 703;
        bmi = Math.ceil(bmi*100)/100;

        if (19.5 >= bmi && bmi <= 25) {
            System.out.println("Your BMI is " + bmi + ".");
            System.out.println("You are within the ideal weight range.");
        } else if (bmi > 25) {
            System.out.println("Your BMI is " + bmi + ".");
            System.out.println("You are overweight. You should see a doctor.");
        } else if (bmi < 19.5) {
            System.out.println("Your BMI is " + bmi + ".");
            System.out.println("You are underweight. You should see a doctor.");
        }
    }
}
