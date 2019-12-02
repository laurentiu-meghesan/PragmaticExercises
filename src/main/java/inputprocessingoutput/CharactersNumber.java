package inputprocessingoutput;

import java.util.Scanner;

public class CharactersNumber {

    public static void main (String[] args){

        System.out.println("What is the input string? ");

        String input;
        int charNr;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        charNr = input.length();

        if (charNr==0){
            System.out.println("You must enter something..");
        }
        else
        System.out.println(input + " has "+charNr+" characters.");


    }

}
