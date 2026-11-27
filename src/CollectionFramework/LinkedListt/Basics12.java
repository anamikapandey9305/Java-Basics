
package CollectionFramework.LinkedListt;

import java.util.LinkedList;
import java.util.Collections;

public class Basics12 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding unsorted elements
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);

        // Printing the original LinkedList
        System.out.println("Original List: " + list);

        // Sorting elements in ascending order
        Collections.sort(list);

        System.out.println("Ascending Order: " + list);

        // Sorting elements in descending order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Descending Order: " + list);
    }
}
