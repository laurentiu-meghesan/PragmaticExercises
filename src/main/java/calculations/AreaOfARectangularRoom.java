package calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {
    public static void main(String[] args){
        System.out.println("What is the length of the room in feet?");
        Scanner sc1=new Scanner(System.in);
        int lenght = sc1.nextInt();
        System.out.println("What is the width of the room in feet?");
        Scanner sc2=new Scanner(System.in);
        int width = sc2.nextInt();
        int area=lenght*width;
        double m2=area*0.09290304;

        System.out.println("You entered dimensions of "+lenght+"feet by "+width+"feet.");
        System.out.println("The area is:");
        System.out.println(area+" square feet");
        System.out.println(m2+" square meters");

    }

}
