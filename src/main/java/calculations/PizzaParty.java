package calculations;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args){
        System.out.println("How many people?");
        Scanner sc1=new Scanner(System.in);
        int people= sc1.nextInt();
        System.out.println("How many pizzas do you have?");
        Scanner sc2=new Scanner(System.in);
        int pizza=sc2.nextInt();
        System.out.println("How many slices per pizza?");
        Scanner sc3=new Scanner(System.in);
        int slices=sc3.nextInt();

        int pieces=(pizza*slices)/people;
        int leftovers=(pizza*slices)%people;

        System.out.println(people+" people with "+pizza+" pizzas.");
        System.out.println("Each person gets "+pieces+" pieces of pizza");

        if (leftovers==0){
            System.out.println("There are 0 leftover pieces.");
        }else
            System.out.println("There are "+leftovers+" leftover pieces.");

    }
}
