package otherExercises;

// Write a Java program to find the common elements between two arrays of integers.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        ArrayList<Long> arr1 = new ArrayList<>();
        ArrayList<Long> arr2 = new ArrayList<>();
        ArrayList<Long> commonElements = new ArrayList<>();

        System.out.println("Enter the first array of numbers, separated by space:");
        Scanner scanner = new Scanner(System.in);
        storeNumbers(arr1, scanner);

        System.out.println("Enter the second array:");
        Scanner scanner1 = new Scanner(System.in);
        storeNumbers(arr2, scanner1);

        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).equals(arr2.get(j))){
                    commonElements.add(arr1.get(i));
                }
            }
        }

        System.out.println("Common elements are: " + commonElements);

    }

    private static void storeNumbers(List<Long> arr, Scanner scanner) {
        long value;
        while (scanner.hasNextLong()) {
            value = scanner.nextLong();
            arr.add(value);
        }
    }


}
