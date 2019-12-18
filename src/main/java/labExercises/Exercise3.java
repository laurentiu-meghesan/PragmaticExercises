package labExercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("How many rounds?");
        Scanner scanner = new Scanner(System.in);
        int nrRounds = scanner.nextInt();


        if (1 >= nrRounds | nrRounds >= 200) {
            System.out.println("You entered an invalid number.");
        } else
            for (int i = 1;  i <= nrRounds; i++) {

                int sumEven = 0, sumOdd = 0;
                System.out.println("Enter the number:");
                Scanner scanner1 = new Scanner(System.in);
                int n = scanner1.nextInt();

                if (1 > n | n >= 10000) {
                    System.out.println("You entered an invalid number.");
                } else {

                    for (int j = 0; j <= n; j++) {

                        if (j % 2 == 0) {
                            sumEven = sumEven + j;
                        } else  {
                            sumOdd = sumOdd + j;
                        }

                    }
                }        System.out.println("The sum of the odd numbers is "+ sumOdd);
                System.out.println("The sum of the even numbers is "+ sumEven);
            }
    }
}
