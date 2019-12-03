package calculations;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){

        System.out.println("What is the length of the room?");
        Scanner sc1=new Scanner(System.in);
        int length = sc1.nextInt();
        System.out.println("Whst is the width of the room?");
        Scanner sc2=new Scanner(System.in);
        int width=sc2.nextInt();
        int area=width*length;
        final double convRate=0.0028571428571429; //wich means 1/350
        double gallons=area*convRate;
        int a=(int)Math.ceil(gallons);

        System.out.println("You will need to purchase "+ a + " gallons of paint to cover "+
                area+" square feet.");


    }

}
