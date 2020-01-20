package repetition;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i, j, n;

        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("The multiplication table of " + n + ":");
        System.out.println();

        System.out.println("Model from \"Constraint\":");
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
        System.out.println();

        System.out.println("Model from \"Challenges\":");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(j * i + "    ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Or:");

        System.out.print("      ");
        for (i = 0; i <= n; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        for (i = 0; i <= n * 6; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (i = 0; i <= n; i++) {
            System.out.format("%4d |", i);
            for (j = 0; j <= n; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}
