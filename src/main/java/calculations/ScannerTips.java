package calculations;

import java.util.Scanner;

public class ScannerTips {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        int int1= 0;
        try {
            int1 = scanner.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
        int int2= scanner.nextInt();
        int int3= scanner.nextInt();
        int int4= scanner.nextInt();
        System.out.println("Entered value: " + int1);
        System.out.println("Entered value: " + int2);
        System.out.println("Entered value: " + int3);
        System.out.println("Entered value: " + int4);

        System.out.println("Enter String:");
        String line = scanner.nextLine();
        System.out.println("Entered line: " + line);

        System.out.println("Enter String2:");
        String line2 = scanner.nextLine();
        System.out.println("Entered line: " + line);
    }
}
