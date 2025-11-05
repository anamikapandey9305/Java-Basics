package Arrays;
import java.util.ArrayList;

public class ArrayListsBsics{
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<String>();
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        // change element
        fruits.set(1,"Orange");
        System.out.println(fruits);
        // Remove element
        fruits.remove(0);
        System.out.println(fruits); // [Orange, Mango]

        // Size
        System.out.println("Size: " + fruits.size()); // 2

    }

}
