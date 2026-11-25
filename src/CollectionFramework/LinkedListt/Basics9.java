
package CollectionFramework.LinkedListt;

import java.util.LinkedList;

public class Basics9 {
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

        // remove() - Removes the first element
        list.remove();

        System.out.println("After remove(): " + list);

        // remove(index) - Removes element at index 1
        list.remove(1);

        System.out.println("After remove(1): " + list);

        // removeFirst() - Removes the first element
        list.removeFirst();

        System.out.println("After removeFirst(): " + list);

        // removeLast() - Removes the last element
        list.removeLast();

        System.out.println("After removeLast(): " + list);

        // clear() - Removes all remaining elements
        list.clear();

        System.out.println("After clear(): " + list);
    }
}
