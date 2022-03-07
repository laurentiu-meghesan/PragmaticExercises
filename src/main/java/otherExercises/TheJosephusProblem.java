package otherExercises;

//This classic problem dates back to Roman times. There are 41 soldiers arranged in a circle. Every third soldier is to be killed by their captors, continuing around the circle until only one soldier remains. He is to be freed. Assuming you would like to stay alive, at what position in the circle would you stand?
//
//Generalize this problem by creating a function that accepts the number of soldiers n and the interval at which they are killed i, and returns the position of the fortunate survivor.
//
//Examples
//josephus(41, 3) ➞ 31
//
//josephus(35, 11) ➞ 18
//
//josephus(11, 1) ➞ 11
//
//josephus(2, 2) ➞ 1
//Notes
//Assume the positions are numbered 1 to n going clockwise around the circle.
//If the interval is 3, the first soldiers to die are at positions 3, 6, and 9.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheJosephusProblem {

    private static int readFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int josephus(int soldiers, int killingInterval) {

        List<Integer> soldiersList = new ArrayList<>();

        for (int i = 0; i < soldiers; i++) {

            soldiersList.add(i);
        }

//        while () {
//            if (i % killingInterval == 0) {
//
//            }
//        }
        return 1;
    }

    public static void main(String[] args) {

        int soldiers, killingInterval;

        try {
            System.out.println("Enter the number of soldiers: ");
            soldiers = readFromUser();
        } catch (Exception e) {
            System.out.println("Invalid number entered. Try again.");
            soldiers = readFromUser();
        }

        try {
            System.out.println("Enter killing interval:");
            killingInterval = readFromUser();
        } catch (Exception e) {
            System.out.println("Invalid number entered. Try again.");
            killingInterval = readFromUser();
        }

        System.out.println("The fortunate survivor is at position " + josephus(soldiers, killingInterval) + ".");
    }
}
