package otherExercises;

//Write a Java Program to find whether a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int nr, temp;
        boolean isPrime = true;

        System.out.println("Enter a number to check if it's prime: ");
        nr = new Scanner(System.in).nextInt();

        for (int i = 2; i <= nr /2 ; i++ ) {

            temp = nr % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(nr + " number is prime.");
        else System.out.println(nr + " number is not prime.");
    }
}
