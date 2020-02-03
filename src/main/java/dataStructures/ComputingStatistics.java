package dataStructures;

import java.util.*;

public class ComputingStatistics {

    private double mean(List<Double> numberList) {
        double mean = 0;
        for (Double aDouble : numberList) {
            mean = mean + aDouble;
        }
        return mean / numberList.size();
    }

    private double standardDeviation(List<Double> numberList, ComputingStatistics computingStatistics) {
        List<Double> meanList = new ArrayList<>();
        double mean = computingStatistics.mean(numberList);
        for (Double aDouble : numberList) {
            double nr = aDouble - mean;
            meanList.add(Math.pow(nr, 2));
        }
        double x = computingStatistics.mean(meanList);
        return Math.sqrt(x);
    }

    public static void main(String[] args) {

        List<Double> numberList = new ArrayList<>();
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter a number:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("done")) {
                flag = true;
            } else {
                double number = Double.parseDouble(input);
                numberList.add(number);
            }
        }
        System.out.println("Numbers: " + numberList);

        ComputingStatistics computingStatistics = new ComputingStatistics();
        System.out.println("The average is " + computingStatistics.mean(numberList) + ".");
        Collections.sort(numberList);
        System.out.println("The minimum is " + numberList.get(0));
        System.out.println("The maximum is " + numberList.get(numberList.size() - 1));
        System.out.println("The standard deviation is " +
                computingStatistics.standardDeviation(numberList, computingStatistics));
    }
}
