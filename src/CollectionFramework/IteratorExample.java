package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
//An Iterator in Java is an object used to traverse a collection, such as an ArrayList, one element at a time.

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // Creating an Iterator to traverse the ArrayList

        // // Checks whether another element is available
        Iterator<Integer> it = list.iterator(); // it is just a variable name that refers to an Iterator object.


        while (it.hasNext()) { // Is another element available?

            // Gets the next element and prints it
            System.out.println(it.next());
        }
    }
}