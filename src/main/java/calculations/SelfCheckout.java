package calculations;

import java.util.Scanner;

public class SelfCheckout {

    public static void main (String[] args){

        System.out.println("Enter the price of item 1: ");
        Scanner sc1=new Scanner(System.in);
        String item1= sc1.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        Scanner sc2=new Scanner(System.in);
        String q1 = sc2.nextLine();
        System.out.println("Enter the price of item 2: ");
        Scanner sc3=new Scanner(System.in);
        String item2= sc3.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        Scanner sc4=new Scanner(System.in);
        String q2 = sc4.nextLine();
        System.out.println("Enter the price of item 3: ");
        Scanner sc5=new Scanner(System.in);
        String item3=sc5.nextLine();
        System.out.println("Enter the quantity of item 3: ");
        Scanner sc6=new Scanner(System.in);
        String q3=sc6.nextLine();

        int i1=Integer.parseInt(item1),i2=Integer.parseInt(item2),i3=Integer.parseInt(item3);
        int c1=Integer.parseInt(q1),c2=Integer.parseInt(q2),c3=Integer.parseInt(q3);
        int subtotal=(i1*c1)+(i2*c2)+(i3*c3);
        double tax = subtotal*5.5/100;
        double total = subtotal+tax;

        System.out.println("Subtotal: "+subtotal);
        System.out.println("Tax: "+tax);
        System.out.println("Total: "+total);

    }
}
