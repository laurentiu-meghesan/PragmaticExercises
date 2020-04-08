package calculations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {

    public static String validateArray(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] < numbersArray[j]) {
                    for (int y = j + 1; y < numbersArray.length; y++) {
                        if (numbersArray[y] < numbersArray[i]) {
                            return "INVALID";
                        }
                    }
                }
            }
        }
        return "VALID";
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\Users\\laur2\\Desktop\\Proiecte FTIT\\PragmaticExercises\\src\\main\\java\\calculations\\exercise 6 - input.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\laur2\\Desktop\\Proiecte FTIT\\PragmaticExercises\\src\\main\\java\\calculations\\exercise 6 - output.txt", true));

        int testCasesCount = scanner.nextInt();

        for (int i = 1; i <= testCasesCount; i++) {
            int arrayLength = scanner.nextInt();

            int[] numbersArray = new int[arrayLength];

            for (int j = 0; j < arrayLength; j++) {
                numbersArray[j] = scanner.nextInt();
            }

            String result = validateArray(numbersArray);

            bufferedWriter.write("CASE #" + i + ": " + result);
            bufferedWriter.newLine();
        }
        scanner.close();
        bufferedWriter.close();
    }
}
