package CollectionFramework;
import java.util.ArrayList; // makes the ArrayList class available in this file.


public class Cf2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // declares a list that stores Integer objects

        numbers.add(10); //adds an element to the list.
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers); //prints the list elements.
    }
}