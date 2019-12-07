package MakingDecisions;

import java.util.Scanner;

public class LegalDrivingAge {

    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner sc1 = new Scanner(System.in);
        int age = sc1.nextInt();

        if (age<16){
            System.out.println("You are not old enough to legally drive.");
        }else
        {
            System.out.println("You are old enough to legally drive.");
        }

    }
}
