package CollectionFramework.LinkedListt.Traversal;

import java.util.LinkedList;
import java.util.Iterator;

public class Basic3 {
    public static void main(String[] args) {

        // Step 1: Create a LinkedList of Integer type.
        // Integer means the list will store integer values.
        LinkedList<Integer> list = new LinkedList<>();

        // Step 2: Add elements to the LinkedList.
        // These elements will be stored in the order they are added.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Step 3: Create an Iterator for the LinkedList.
        // list.iterator() returns an Iterator object.
        // The Iterator helps us access elements one by one.
        // Initially, the Iterator is positioned before the first element.
        Iterator<Integer> it = list.iterator();

        // Step 4: Traverse the LinkedList using a while loop.
        // hasNext() checks whether another element is available.
        // If an element is available, it returns true.
        // If no elements are left, it returns false.
        while (it.hasNext()) {

            // Step 5: Retrieve the next element.
            // next() returns the current element and moves the Iterator forward.
            // The first call returns 10, the second returns 20, and so on.
            int num = it.next();

            // Step 6: Print the element retrieved by the Iterator.
            System.out.println(num);
        }

        // Step 7: When all elements have been visited,
        // hasNext() returns false and the while loop stops.
    }
}