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

                List<Integer> nrsList = new ArrayList<>();
                int nr = 0;
                for (int j = i; j < s.length(); j++) {
                    if (Character.isDigit(chars[j])) {
                        nrsList.add(Integer.parseInt(String.valueOf(chars[j])));
                    } else break;
                    i = j;
                }
                int n = nrsList.size() - 1;
                for (Integer integer : nrsList) {
                    nr = nr + (int) (integer * Math.pow(10, n));
                    n = n - 1;
                }
                nrList.add(nr);
            }
        }
        System.out.println("The even numbers are " + filteringValues.filterEvenNumbers(nrList));
    }
}
