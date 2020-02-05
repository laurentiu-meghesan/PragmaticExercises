package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilteringValues {

    private List<Integer> filterEvenNumbers(List<Integer> listNr) {

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer integer : listNr) {
            if (integer % 2 == 0) {
                evenNumbers.add(integer);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
        System.out.println("Enter a list of numbers separated by spaces: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        FilteringValues filteringValues = new FilteringValues();
        char[] chars = s.toCharArray();
        List<Integer> nrList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(chars[i])) {
                nrList.add(Integer.parseInt(String.valueOf(chars[i])));
            }
        }
        System.out.println("The even numbers are " + filteringValues.filterEvenNumbers(nrList));
    }
}
