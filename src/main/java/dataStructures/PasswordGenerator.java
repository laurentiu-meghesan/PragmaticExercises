package dataStructures;

import java.util.*;

public class PasswordGenerator {

    public static void main(String[] args) {
        System.out.println("What's the minimum length?");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("How many special characters?");
        Scanner scanner1 = new Scanner(System.in);
        int special = scanner1.nextInt();
        scanner1.nextLine();
        System.out.println("How many numbers?");
        Scanner scanner2 = new Scanner(System.in);
        int numbers = scanner2.nextInt();
        scanner2.nextLine();
        System.out.println("How many passwords would you like to be generated?");
        Scanner scanner3 = new Scanner(System.in);
        int passNr = scanner3.nextInt();
        scanner3.nextLine();

        String specialCh = "~!@#$%^&*()_+{}|:<>?";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String nrs = "0123456789";
        int n = specialCh.length();
        int n1 = alphabet.length();
        int n2 = nrs.length();

        for (int j = 1; j <= passNr; j++) {
            Random random = new Random();
            List<Character> charList = new ArrayList<>();
            for (int i = 0; i < special; i++) {
                charList.add(specialCh.charAt(random.nextInt(n)));
            }
            for (int i = special; i < special + numbers; i++) {
                charList.add(nrs.charAt(random.nextInt(n2)));
            }
            for (int i = special + numbers; i < length; i++) {
                charList.add(alphabet.charAt(random.nextInt(n1)));
            }

            Collections.shuffle(charList);

            StringBuilder sb = new StringBuilder();
            for (Character ch : charList) {
                sb.append(ch);
            }
            String password = sb.toString();

            System.out.println("Password nr " + j + " is " + password);
        }
    }
}
