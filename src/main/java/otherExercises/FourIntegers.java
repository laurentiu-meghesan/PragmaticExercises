package otherExercises;
//Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

import java.util.Scanner;

public class FourIntegers {
    public static void main(String[] args) {
        System.out.println("Input first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNr = scanner.nextInt();
        System.out.println("Input second number: ");
        Scanner scanner1 = new Scanner(System.in);
        int secondNr = scanner1.nextInt();
        System.out.println("Input third number: ");
        Scanner scanner2 = new Scanner(System.in);
        int thirdNr = scanner2.nextInt();
        System.out.println("Input fourth number: ");
        Scanner scanner3 = new Scanner(System.in);
        int fourthNr = scanner3.nextInt();

        if (firstNr == secondNr && firstNr == thirdNr && firstNr == fourthNr){
            System.out.println("Numbers are equal!");
        } else System.out.println("Numbers are not equal!");
    }
}
