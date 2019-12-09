package MakingDecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {

    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        if (c.equals("y") | c.equals("Y")) {
            System.out.println("Are the battery terminals corroded?");
            Scanner sc1 = new Scanner(System.in);
            String c1 = sc.nextLine();

            if (c1.equals("y") | c1.equals("Y")) {
                System.out.println("Clean terminals and try starting again.");
            } else if (c1.equals("n") | c1.equals("N")) {
                System.out.println("The battery cables may be damaged.");
                System.out.println("Replace cables and try again.");
            }
        } else if (c.equals("n") | c.equals("N")) {

            System.out.println("Does the car make a clicking noise?");
            Scanner sc2 = new Scanner(System.in);
            String c2 = sc2.nextLine();

            if (c2.equals("y") | c2.equals("Y")) {
                System.out.println("Replace the battery.");
            } else if (c2.equals("n") | c2.equals("N")) {
                System.out.println("Does the car crank up but fail to start?");
                Scanner sc3 = new Scanner(System.in);
                String c3 = sc3.nextLine();

                if (c3.equals("y") | c3.equals("Y")) {
                    System.out.println("Check spark plug connections.");
                } else if (c3.equals("n") | c3.equals("N")) {
                    System.out.println("Does the engine start and then die?");
                    Scanner sc4 = new Scanner(System.in);
                    String c4 = sc4.nextLine();

                    if (c4.equals("y") | c4.equals("Y")) {
                        System.out.println("Does your car have fuel injection?");
                        Scanner sc5 = new Scanner(System.in);
                        String c5 = sc5.nextLine();

                        if (c5.equals("n") | c5.equals("N")) {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        } else if (c5.equals("y") | c5.equals("Y")) {
                            System.out.println("Get it in for service.");
                        }
                    }
                }

            }

        }

    }
}
