package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {

    public static void main(String[] args) {
        List<String> answerList = new ArrayList<>();
        answerList.add("Yes.");
        answerList.add("No.");
        answerList.add("Maybe.");
        answerList.add("Ask again later.");

        System.out.println("What's your question?");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        int index = ThreadLocalRandom.current().nextInt(0,answerList.size());
        System.out.println(answerList.get(index));

    }
}
