package inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args){

        System.out.println("What is the first number?");
        Scanner sc1=new Scanner(System.in);
        String a=sc1.nextLine();
        System.out.println("What is the second number?");
        Scanner sc2=new Scanner(System.in);
        String b=sc2.nextLine();

        int nr1=Integer.parseInt(a);
        int nr2=Integer.parseInt(b);
        int sum=nr1+nr2;
        System.out.println(a+" + "+b+" = "+ sum);
        int sub=nr1-nr2;
        System.out.println(a+" - "+b+" = "+ sub);
        int prod=nr1*nr2;
        System.out.println(a+" * "+b+" = "+ prod);
        int div=nr1/nr2;
        System.out.println(a+" / "+b+" = "+ div);


    }

}
