package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {

    public static void main(String[] args) {

        List<String> employeeList = new ArrayList<>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jones");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        System.out.println("There are " + employeeList.size() + " employees:");

        for (String s : employeeList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Enter an employee name to remove:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < employeeList.size(); i++){
            if (name.matches(employeeList.get(i))){
                employeeList.remove(i);
                flag = true;
            }
        }

        if (!flag) System.out.println("Error. Name not found!");
        System.out.println();

        for (String s : employeeList){
            System.out.println(s);
        }
    }
}
