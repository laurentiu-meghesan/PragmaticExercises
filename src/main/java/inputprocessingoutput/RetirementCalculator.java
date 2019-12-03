package inputprocessingoutput;

//import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args){

        System.out.println("What is your courent age?");
        Scanner sc1=new Scanner(System.in);
        String sir1=sc1.nextLine();
        int age=Integer.parseInt(sir1);

        System.out.println("At what age would you like to retire?");
        Scanner sc2=new Scanner(System.in);
        String sir2=sc2.nextLine();
        int age2=Integer.parseInt(sir2);
        int difAge=age2-age;
        int year= Calendar.getInstance().get(Calendar.YEAR);
        int year2=year+difAge;

        if (difAge<0){

            System.out.println("You could retire for "+ Math.abs(difAge)+" years.");
            System.out.println("It`s "+ year + ", so you could retire from "+year2 +".");

        }else {
            System.out.println("You have " + difAge + " years left until you can retire.");
            System.out.println("It`s "+ year+", so you can retire in "+year2+".");
        }
    }

}
