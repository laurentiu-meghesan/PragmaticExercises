package inputprocessingoutput;

import java.util.Scanner;

public class MadLib {

    public static void main(String[] args){

        System.out.println("Enter a noun: ");
        Scanner sc1=new Scanner(System.in);
        String noun=sc1.nextLine();
        System.out.println("Enter a verb: ");
        Scanner sc2=new Scanner(System.in);
        String verb=sc2.nextLine();
        System.out.println("Enter an adjective: ");
        Scanner sc3=new Scanner(System.in);
        String adjective=sc3.nextLine();
        System.out.println("Enter an adverb: ");
        Scanner sc4=new Scanner(System.in);
        String adverb=sc4.nextLine();

        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "
                +adverb+"? That`s hilarious!");


    }

}
