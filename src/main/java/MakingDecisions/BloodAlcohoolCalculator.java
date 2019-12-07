package MakingDecisions;

import java.util.Scanner;

public class BloodAlcohoolCalculator {

    public static void main(String[] args){

        System.out.println("What is your weight?");
        Scanner sc1=new Scanner(System.in);
        double weight= sc1.nextDouble();
        System.out.println("What is you gender?");
        Scanner sc2=new Scanner(System.in);
        String  gen= sc2.nextLine();
        System.out.println("What is the number of drinks?");
        Scanner sc3=new Scanner(System.in);
        int nrDrinks= sc3.nextInt();
        System.out.println("What is the amount of alcohol by volume?");
        Scanner sc4=new Scanner(System.in);
        int amount = sc4.nextInt();
        System.out.println("What is the amount of time in hours since your last drink?");
        Scanner sc5=new Scanner(System.in);
        int amountTime=sc5.nextInt();

        if(gen.equals("male")){

            double r = 0.73;
            double bac = (nrDrinks*5.14/weight*r)-0.015*amountTime;
            System.out.println("Your BAC is "+bac+".");

            if (bac<0.08){
                System.out.println("Is legal for you to drive.");
            }else
            {
                System.out.println("It is not legal for you to drive.");
            }
        }else {

            double r = 0.66;
            double bac = (nrDrinks*5.14/weight*r)-0.015*amountTime;
            System.out.println("Your BAC is "+bac+".");

            if (bac<0.08){
                System.out.println("Is legal for you to drive.");
            }else
            {
                System.out.println("It is not legal for you to drive.");
            }

        }
    }
}
