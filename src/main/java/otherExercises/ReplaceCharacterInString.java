package otherExercises;

//24. Write a Java program to replace all the 'd' characters with 'f' characters.
//
//Sample Output:
//
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown fox jumps over the lazy fog.

import java.util.Collections;
import java.util.Scanner;

public class ReplaceCharacterInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original String: ");
        String originalString = scanner.nextLine();
        System.out.println();

        System.out.println("Original string: " + originalString);

        char newChar = 'm';

        String newString = originalString.replace('a', newChar);

        System.out.println("New String: " + newString);
    }
}
