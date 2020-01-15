package repetition;

import java.util.Scanner;

public class HandlingBadInput {
    private int r;

    private int getR() {
        return r;
    }

    private int years() {
        System.out.println("What is the rate of return?");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        scanner.nextLine();
        return 72 / r;
    }

    public static void main(String[] args) {

        boolean flag = false;

        HandlingBadInput handlingBadInput = new HandlingBadInput();

        do {
            try {
                System.out.println("It will take " + handlingBadInput.years() + " years to double your initial investment.");
                flag = true;
            } catch (ArithmeticException e) {
                System.out.println("You cannot have " + handlingBadInput.getR() + " rate.");
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        } while (!flag);
    }
}
