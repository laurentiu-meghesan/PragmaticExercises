package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PickingAWinner {

    public static void main(String[] args) {

        boolean flag = false;
        List<String> nameList = new ArrayList<>();

        while (!flag) {
            System.out.println("Enter a name:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            if (name.isBlank()) {
                flag = true;
            } else {
                nameList.add(name);
            }
        }

        System.out.println(nameList);
        while (nameList.size() >= 2) {
            int index = ThreadLocalRandom.current().nextInt(0, nameList.size());
            System.out.println("The winner is..." + nameList.get(index));
            nameList.remove(index);
            System.out.println(nameList);
        }
    }
}
