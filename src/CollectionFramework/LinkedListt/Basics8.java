
package CollectionFramework.LinkedListt;

import java.util.LinkedList;

public class Basics8 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Printing original LinkedList
        System.out.println("Original List: " + list);

        // set(index, element) - Updates an element at a specific index
        list.set(1, 100);

        // Printing updated LinkedList
        System.out.println("Updated List: " + list);

        // Updating another element
        list.set(3, 400);

        // Printing final LinkedList
        System.out.println("Final List: " + list);
    }
}
