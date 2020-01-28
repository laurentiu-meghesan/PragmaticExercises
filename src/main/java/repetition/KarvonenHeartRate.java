package repetition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KarvonenHeartRate {

    private int targetHeartRate(double age, double restingHR, double intensity) {
        return (int) (Math.round((((220 - age) - restingHR) * intensity / 100) + restingHR));
    }

    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        boolean flag = false, flag1 = false;
        int intensity = 55;
        int age = 0, restingHR = 0;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                age = scanner.nextInt();
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
                restingHR = scanner1.nextInt();
                scanner1.nextLine();

                if (restingHR >= 250 | restingHR <= 50) {
                    System.out.println("Please enter a heart rate between 50 and 250:");
                    flag1 = false;
                } else flag1 = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid heart rate:");
            }
        } while (!flag1);

        KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();
        List<Integer> intensityList = new ArrayList<>();
        List<Integer> rateList = new ArrayList<>();

        for (int i = 0; i <= ((95 - 55) / 5); i++) {
            intensityList.add(intensity);
            rateList.add(karvonenHeartRate.targetHeartRate(age, restingHR, intensity));

            intensity = intensity + 5;
        }

        System.out.println();
        System.out.printf("%10s %2s %4s", "Intensity", "|", "Rate");
        System.out.println();
        System.out.println("---------------------");
        for (int j = 0; j < intensityList.size(); j++) {
            System.out.format("%4s %8s %3s %1s",
                    intensityList.get(j)+"%","|", rateList.get(j), "bpm");
            System.out.println();
        }
        System.out.println("---------------------");

    }
}
