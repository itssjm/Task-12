package Task.Task_12;

import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Convert List to array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
