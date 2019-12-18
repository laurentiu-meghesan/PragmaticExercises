package labExercises;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println("How many rounds?");
        Scanner scanner = new Scanner(System.in);
        int nrRounds = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("How many queries?");

        if (1 >= nrRounds | nrRounds >= 100) {
            System.out.println("You entered an invalid number.");
        } else
            for (int i = 1; i <= nrRounds; i++) {

                Scanner scanner1 = new Scanner(System.in);
                int nrQueries = scanner1.nextInt();
//                System.out.println(nrQueries);

                for (int j = 1; j <= nrQueries; j++) {

                    if (1 >= nrQueries | nrQueries >= 100) {
                        System.out.println("You entered an invalid number.");
                    } else {
                        System.out.println("Enter query");
                        Scanner scanner2 = new Scanner(System.in);
                        String string = scanner2.nextLine();
//                        System.out.println(string);

                        if (string.equals("a")) {
                            Scanner scanner3 = new Scanner(System.in);
                            int input = scanner3.nextInt();
                            arrayList.add(input);
                        } else if (string.equals("b")) {
                            Collections.sort(arrayList);
                        }else if (string.equals("c")){
                            Collections.reverse(arrayList);
                        }else if (string.equals("d")){
                            System.out.println(arrayList.size());
                        }else if (string.equals("e")){
                            for (int k=1;k<=arrayList.size();k++){
                                System.out.print(arrayList.get(k)+" ");
                            }
                        }else if (string.equals("f")){
                            Collections.sort(arrayList);
                            Collections.reverse(arrayList);
                        }
                    }
                }
                System.out.println(arrayList);
            }
    }
}
