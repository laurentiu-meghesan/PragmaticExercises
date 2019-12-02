package inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {

        System.out.println("What is your name? ");
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
    }

