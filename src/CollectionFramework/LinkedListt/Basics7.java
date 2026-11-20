
package CollectionFramework.LinkedListt;

import java.util.LinkedList;

public class Basics7 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Printing the LinkedList
        System.out.println("Original List: " + list);

        // Accessing Element

        // 1. get(index) - Access element at a specific index
        System.out.println("Element at index 2: " + list.get(2));

        // 2. getFirst() - Access the first element
        System.out.println("First Element: " + list.getFirst());

        // 3. getLast() - Access the last element
        System.out.println("Last Element: " + list.getLast());

        // --- Calling these methods on an empty LinkedList throws NoSuchElementException for getFirst() and getLast().

    }
}
