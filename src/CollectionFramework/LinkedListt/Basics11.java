
package CollectionFramework.LinkedListt;

import java.util.LinkedList;
import java.util.Iterator;

public class Basics11 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Printing the original LinkedList
        System.out.println("LinkedList: " + list);

        // 1. Using a normal for loop
        System.out.println("Using for loop:");

        for (int i = 0; i < list.size(); i++) {

            // Accessing each element using its index
            System.out.println(list.get(i));
        }

        // 2. Using an enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (int num : list) {

            // Printing each element directly
            System.out.println(num);
        }

        // 3. Using Iterator
        System.out.println("Using Iterator:");

        Iterator<Integer> it = list.iterator();

        // hasNext() checks whether another element exists
        while (it.hasNext()) {

            // next() returns the next element
            System.out.println(it.next());

           // Method	Explanation
            //for loop	Uses an index to access elements
            //Enhanced for loop	Visits each element directly
            //Iterator	Uses hasNext() and next() to visit elements

            //A LinkedList is not efficient for repeated index-based access. A normal for loop using get(i) can take O(n²) time overall. The enhanced for loop and Iterator traverse the list in O(n) time.

        }
    }
}
