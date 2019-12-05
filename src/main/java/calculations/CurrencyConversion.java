package calculations;

import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args){

        System.out.println("How many euros are you exchanging? ");
        Scanner s1=new Scanner(System.in);
        int euro=s1.nextInt();
        System.out.println("What is the exchange rate? ");
        Scanner s2=new Scanner(System.in);
        double rate=s2.nextDouble();

        double a=euro*rate/100;
        double b=Math.ceil(a*100)/100;

        System.out.println(euro+" euros at an exchange rate of "+rate+" is "+b+" U.S. dollars.");


    }
}
