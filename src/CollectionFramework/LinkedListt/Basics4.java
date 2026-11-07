
package CollectionFramework.LinkedListt;

import java.util.List;
import java.util.LinkedList;

public class Basics4 {
    public static void main(String[] args) {

        // Creating LinkedList using List interface
        List<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Printing list
        System.out.println(list);

        // Accessing elements
        System.out.println(list.get(1));
    }
}
