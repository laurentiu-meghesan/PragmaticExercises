package repetition;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumberGame {

    private void diff1() {

        int nrToBeGuessed = ThreadLocalRandom.current().nextInt(1, 10);
        int guess = 0;
        int guesses = 1;
        System.out.println("I have my number. What's your guess?");

        try {
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            scanner.nextLine();
            if (guess <= 0 | guess > 10) {
                System.out.println("In difficulty level 1 you should guess a number between 1 and 10. Try again.");
                diff1();
            }
        } catch (Exception e) {
            System.out.println("In difficulty level 1 you should guess a number between 1 and 10. Try again.");
            diff1();
        }

        while (nrToBeGuessed != guess) {
            if (nrToBeGuessed > guess) {
                System.out.println("Too low. Guess again:");
            } else if (nrToBeGuessed < guess) {
                System.out.println("Too high. Guess again:");
            }
            try {
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Enter a number please!");
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
                scanner.nextLine();
            }
            guesses++;
        }
        System.out.println("You got it in " + guesses + " guesses!");
    }

    private void diff2() {

        int nrToBeGuessed = ThreadLocalRandom.current().nextInt(1, 100);
        int guess = 0;
        int guesses = 1;
        System.out.println("I have my number. What's your guess?");

        try {
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            scanner.nextLine();
            if (guess <= 0 | guess > 100) {
                System.out.println("In difficulty level 2 you should guess a number between 1 and 100. Try again.");
                diff2();
            }
        } catch (Exception e) {
            System.out.println("In difficulty level 2 you should guess a number between 1 and 10. Try again.");
            diff2();
        }

        while (nrToBeGuessed != guess) {
            if (nrToBeGuessed > guess) {
                System.out.println("Too low. Guess again:");
            } else if (nrToBeGuessed < guess) {
                System.out.println("Too high. Guess again:");
            }
            try {
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Enter a number please!");
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
                scanner.nextLine();
            }
            guesses++;
        }
        System.out.println("You got it in " + guesses + " guesses!");
    }

    private void diff3() {

        int nrToBeGuessed = ThreadLocalRandom.current().nextInt(1, 1000);
        int guess = 0;
        int guesses = 1;
        System.out.println("I have my number. What's your guess?");

        try {
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            scanner.nextLine();
            if (guess <= 0 | guess > 1000) {
                System.out.println("In difficulty level 3 you should guess a number between 1 and 1000. Try again.");
                diff3();
            }
        } catch (Exception e) {
            System.out.println("In difficulty level 3 you should guess a number between 1 and 1000. Try again.");
            diff3();
        }

        while (nrToBeGuessed != guess) {
            if (nrToBeGuessed > guess) {
                System.out.println("Too low. Guess again:");
            } else if (nrToBeGuessed < guess) {
                System.out.println("Too high. Guess again:");
            }
            try {
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a number please!");
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
                scanner.nextLine();
            }
            guesses++;
        }
        System.out.println("You got it in " + guesses + " guesses!");
    }

    public static void main(String[] args) {

        boolean flag = false;

        do {
            System.out.println("Let's play Guess the Number.");
            boolean flag1;
            int difficulty = 0;
            do {
                try {
                    System.out.println("Pick a difficulty level (1, 2, or 3):");
                    Scanner scanner = new Scanner(System.in);
                    difficulty = scanner.nextInt();
                    scanner.nextLine();
                    if (difficulty >= 1 & difficulty <= 3) {
                        flag1 = true;
                    } else {
                        System.out.println("Pick between 1,2 or 3!");
                        flag1 = false;
                    }

                } catch (Exception e) {
                    flag1 = false;
                }
            } while (!flag1);

            GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
            if (difficulty == 1) {
                guessTheNumberGame.diff1();
            } else if (difficulty == 2) {
                guessTheNumberGame.diff2();
            } else guessTheNumberGame.diff3();


            boolean flag2 = false;
            do {
                System.out.println("Play again?");
                Scanner scanner = new Scanner(System.in);
                String playAgain = scanner.nextLine();

                if (playAgain.charAt(0) == 'y' | playAgain.charAt(0) == 'Y') {
                    flag = true;
                    flag2 = false;
                } else if (playAgain.charAt(0) == 'n' | playAgain.charAt(0) == 'N') {
                    flag = false;
                    flag2 = false;
                } else {
                    System.out.println("Please type y or n!");
                    flag2 = true;
                }
            } while (flag2);

        } while (flag);
        System.out.println("Goodbye!");
    }
}
