
package CollectionFramework.LinkedListt;

import java.util.LinkedList;

public class Basics6 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // 1. add() - Adds an element at the end
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        // 2. addFirst() - Adds an element at the beginning
        list.addFirst(5);

        System.out.println("After addFirst(): " + list);

        // 3. addLast() - Adds an element at the end
        list.addLast(40);

        System.out.println("After addLast(): " + list);

        // 4. add(index, element) - Adds an element at a specific index
        list.add(2, 15);

        System.out.println("After add(index, element): " + list);
    }
}
