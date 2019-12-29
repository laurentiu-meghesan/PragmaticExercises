package functions;

import java.util.Scanner;

public class AnagramChecker {

    public static class Class {
        boolean isAnagram(String string1, String string2) {
            boolean ch = false;
            if (string1.length() == string2.length()) {
                char[] a = string1.toCharArray();
                char[] b = string2.toCharArray();

                for (int i = 0; i < string1.length(); i++) {
                    if (a[i] != b[i]) {
                        ch = false;
                        break;
                    }else ch = true;
                }
            }
            return ch;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        Scanner scanner1 = new Scanner(System.in);
        String secondString = scanner1.nextLine();

        Class check = new Class();
        check.isAnagram(firstString, secondString);
        if (check.isAnagram(firstString, secondString)) {
            System.out.println(firstString + " is anagram with " + secondString + ".");
        } else {
            System.out.println(firstString + " is not anagram with " + secondString + ".");
        }
    }
}
