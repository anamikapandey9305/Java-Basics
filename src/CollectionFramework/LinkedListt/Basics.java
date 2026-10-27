package CollectionFramework.LinkedListt;
import java.util.LinkedList; // Import LinkedList class

public class Basics {
    public static void main(String[]args) {

        // creating a LinkedList
//        java.util.LinkedList<Integer> list =
//                new java.util.LinkedList<>(); // without importing we can write in this way also

       // with importing this is the best way
         LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // printing elements
        System.out.println(list);


    }
}
//1. Why do we import the LinkedList class?
//In Java, the LinkedList class is already created for us by Java developers. We don't need to write its internal code ourselves.

//But this class belongs to the java.util package, so we import it to use the class by its simple name.
