package CollectionFramework.LinkedListt;
import java.util.ArrayList;
import java.util.LinkedList;

//First, create an ArrayList and add some elements. Then pass that ArrayList inside the LinkedList constructor.


public class Basics5 {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);

        // Creating LinkedList from ArrayList
        LinkedList<Integer> list = new LinkedList<>(arr);

        // Printing LinkedList
        System.out.println(list);

        //we can create a new LinkedList by copying elements from an existing collection, such as an ArrayList or another LinkedList.

        //Let's break it down:
        //- LinkedList<Integer> — creates a LinkedList that stores Integer values.
        //- list — reference variable.
        //- new LinkedList<>() — creates a new LinkedList.
        //- arr — passes the existing ArrayList to the constructor.
    }
}