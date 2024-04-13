package Task.Task_12;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee IDs and names to the TreeMap
        employeeMap.put(1001, "John");
        employeeMap.put(1002, "Jane");
        employeeMap.put(1003, "Alice");
        employeeMap.put(1004, "Babu");

        // Create a List to store the names and sort it
        List<String> names = new ArrayList<>(employeeMap.values());
        Collections.sort(names);

        // Print the names of all employees in alphabetical order
        System.out.println("Names of all employees in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}