package repetition;

import java.util.Scanner;

public class KarvonenHeartRate {

    private double targetHeartRate(int age, int restingHR, int intensity) {
        return (((220 - age) - restingHR) * intensity) + restingHR;
    }

    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        boolean flag = false, flag1 = false;
        int intensity = 55;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                scanner.nextLine();

                if (age <= 1) {
                    System.out.println("Please enter a valid age:");
                    flag = false;
                } else flag = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid age:");
            }
        } while (!flag);

        System.out.println("Enter your resting heart rate:");
        do {
            try {
                Scanner scanner1 = new Scanner(System.in);
                int restingHR = scanner1.nextInt();
                scanner1.nextLine();

                if (restingHR >= 250 | restingHR <= 50) {
                    System.out.println("Please enter a heart rate between 50 and 250:");
                    flag1 = false;
                } else flag1 = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid heart rate:");
            }
        } while (!flag1);

//        System.out.format("%4d", Intensity);

    }
}
