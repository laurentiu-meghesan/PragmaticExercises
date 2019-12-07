package MakingDecisions;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner sc1 = new Scanner(System.in);
        double order = sc1.nextDouble();
        System.out.println("What is the state?");
        Scanner sc2 = new Scanner(System.in);
        String state = sc2.nextLine();
        double taxWI = 5.5/10;
        double sum = order+taxWI;
        double s = Math.ceil(sum*100)/100;


        if (state.equals("WI")){

            System.out.println("The subtotal is $"+((order*100)/100)
            +'\n'+"The tax is $"+ taxWI+'\n'+
                    "The tolal is $"+s);
        }

        if (!state.equals("WI")){
            System.out.println("The total is $"+order);
        }
    }
    }
