package Task.Task_12;

import java.util.ArrayList;

public class RemoveAllElements {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        
        // Print the ArrayList before removal
        System.out.println("ArrayList before removal: " + arrayList);

        // Remove all elements from the ArrayList
        arrayList.clear();

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + arrayList);
    }
}
