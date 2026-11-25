
package CollectionFramework.LinkedListt;

import java.util.LinkedList;

public class Basics10 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements, including duplicate values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(20);

        // Printing the original LinkedList
        System.out.println("Original List: " + list);

        // contains() - Checks whether the value exists
        System.out.println("Contains 30: " + list.contains(30));

        // Searching for a value that does not exist
        System.out.println("Contains 50: " + list.contains(50));

        // indexOf() - Returns the first index of the value
        System.out.println("First index of 20: " + list.indexOf(20));

        // lastIndexOf() - Returns the last index of the value
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        // Searching for a value that does not exist
        System.out.println("Index of 50: " + list.indexOf(50));
    }
}
