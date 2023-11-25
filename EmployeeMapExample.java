package GuviJavaCollections;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> employeeMap = new TreeMap<>();


        employeeMap.put(101, "Thiru");
        employeeMap.put(102, "Ram");
        employeeMap.put(103, "Raju");
        employeeMap.put(104, "Rani");


        System.out.println("Names of Employees in Alphabetical Order:");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
