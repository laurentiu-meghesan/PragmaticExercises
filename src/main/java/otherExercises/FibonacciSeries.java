package otherExercises;

//Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.

import java.util.Scanner;

public class FibonacciSeries {

    private static int fibonacci(int nr) {

        if (nr == 1 || nr == 2) {
            return 1;
        }

        int fib1 = 1, fib2 = 1, fib = 1;

        for (int i = 3; i <= nr; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        int nr = new Scanner(System.in).nextInt();

        for (int i = 1; i <= nr; i++) {
            System.out.print(fibonacci(i) + "  ");
        }
        System.out.println("");
    }
}
