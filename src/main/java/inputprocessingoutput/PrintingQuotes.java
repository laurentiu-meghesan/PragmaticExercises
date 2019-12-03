package inputprocessingoutput;


import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args){
        System.out.println("What is the quote? ");
        Scanner sc=new Scanner(System.in);
        String quote=sc.nextLine();
        System.out.println("Who said that? ");
        Scanner sc2=new Scanner(System.in);
        String author=sc2.nextLine();

        System.out.println(author+" says, \""+quote+"\".");

    }
}
