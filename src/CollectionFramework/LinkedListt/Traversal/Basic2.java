package CollectionFramework.LinkedListt.Traversal;

import java.util.LinkedList;

public class Basic2 {
    public static void main(String args[]) {

        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Traversal using a normal for loop
        System.out.println("Without enhanced for loop:");

        for (int i = 0; i < list.size(); i++) {

            // Access element using index
            System.out.println(list.get(i));
        }

        // Traversal using an enhanced for loop
        System.out.println("With enhanced for loop:");

        for (int num : list) {

            // Print the current element
            System.out.println(num);
        }
    }
}