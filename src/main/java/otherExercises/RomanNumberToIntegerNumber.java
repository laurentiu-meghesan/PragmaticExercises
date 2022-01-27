package otherExercises;

//Write a Java program to convert Roman number to an integer number.

import java.util.Scanner;

public class RomanNumberToIntegerNumber {

    public static void main(String[] args) {

        System.out.println("Enter a roman number:");
        Scanner scanner = new Scanner(System.in);
        String romanNr = scanner.nextLine();
        int integerNr = 0;

        for (int i = 0; i < romanNr.length(); i++) {
            if (romanNr.charAt(i) != 'I' && romanNr.charAt(i) != 'V' && romanNr.charAt(i) != 'X'
                    && romanNr.charAt(i) != 'L' && romanNr.charAt(i) != 'C' && romanNr.charAt(i) != 'D'
                        && romanNr.charAt(i) != 'M'){
                System.out.println("The roman number entered is not correct!");
            }

            if (romanNr.charAt(0) == 'I'){

            }
        }

        System.out.println("The conversion from roman to integer number is: " + integerNr);

    }
}
