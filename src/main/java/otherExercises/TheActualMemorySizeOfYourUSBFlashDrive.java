package otherExercises;

//Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.
//
//Examples
//actualMemorySize("32GB") ➞ "29.76GB"
//
//actualMemorySize("2GB") ➞ "1.86GB"
//
//actualMemorySize("512MB") ➞ "476MB"
//Notes
//The actual storage loss on a USB device is 7% of the overall memory size!
//If the actual memory size was greater than 1 GB, round your result to two decimal places.
//If the memory size after adjustment is smaller then 1 GB, return the result in MB.
//For the purposes of this challenge, there are 1000 MB in a Gigabyte.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheActualMemorySizeOfYourUSBFlashDrive {

    private static int getMemorySize(String sizeStr) {

        int actualSize = 0;
        List<Integer> digits = new ArrayList<>();

        for (int i = 0; i < sizeStr.length(); i++) {

            if (Character.isDigit(sizeStr.charAt(i))) {
                digits.add(Integer.parseInt(String.valueOf(sizeStr.charAt(i))));
            } else break;
        }

        for (int i = 0; i < digits.size(); i++) {

            actualSize = (int) (actualSize + (digits.get(i) * (Math.pow(10, (digits.size() - i - 1)))));
        }

        return actualSize;
    }

    private static boolean isGigaSize(String string) {

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == 'g' || string.charAt(i) == 'G') {
                return true;
            }
        }
        return false;
    }

    private static double realSize(int actualSize) {

        return Math.round((actualSize - ((double) actualSize * 7 / 100)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        System.out.println("Enter the actual size of USB Flash Drive: ");
        Scanner scanner = new Scanner(System.in);
        String sizeStr = scanner.nextLine();

        int actualMemorySize = getMemorySize(sizeStr);
        boolean isGigaSize = isGigaSize(sizeStr);
        double realSize = realSize(actualMemorySize);

        System.out.println("Memory size entered: " + actualMemorySize);

        if (isGigaSize && actualMemorySize > 1) {
            System.out.println("actualMemorySize(" + actualMemorySize + "GB) ➞ " + realSize + "GB");

        } else if (isGigaSize && actualMemorySize == 1) {
            realSize = realSize(1000);
            System.out.println("actualMemorySize(" + actualMemorySize + "GB) ➞ " + realSize + "MB");

        } else {
            System.out.println("actualMemorySize(" + actualMemorySize + "MB) ➞ " + realSize + "MB");

        }
    }
}
