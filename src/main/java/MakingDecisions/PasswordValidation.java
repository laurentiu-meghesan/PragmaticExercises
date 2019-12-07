package MakingDecisions;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args){
        System.out.println("What is the password?");
        Scanner sc1=new Scanner(System.in);
        String pass= sc1.nextLine();

        String p = "abc$123";

        if (pass.equals(p)){
            System.out.println("Welcome!");
        }else
            System.out.println("I don`t know you.");
}
}
