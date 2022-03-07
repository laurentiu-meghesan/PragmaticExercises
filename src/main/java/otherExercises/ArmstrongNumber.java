package otherExercises;

//A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
// You need to write a program to check if the given number is Armstrong number or not.

import java.util.Scanner;

public class ArmstrongNumber {

    private static int getNrFromUser() {
        return new Scanner(System.in).nextInt();
    }

    private static boolean isArmstrongNr(int nrFromUser) {

        String temp = Integer.toString(nrFromUser);

        int[] numbers = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        int cubesSum = 0;

        for (int number : numbers) {
            cubesSum += (int) Math.pow(number, 3);
        }

        return cubesSum == nrFromUser;
    }

    public static void main(String[] args) {

        System.out.println("Enter your number: ");

        int nrFromUser = getNrFromUser();

        if (isArmstrongNr(nrFromUser)) System.out.println(nrFromUser + " is an Armstrong number.");
        else System.out.println(nrFromUser + " is not an Armstrong number.");
    }
}