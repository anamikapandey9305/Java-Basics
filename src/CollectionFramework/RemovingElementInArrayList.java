package CollectionFramework;
import java.util.ArrayList;

public class RemovingElementInArrayList {
    public static void main(String[]args) {

        ArrayList<Integer> list = new ArrayList<>();

        //Adding elements

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(80);
        list.add(100);
        System.out.println("Orignal list"+ list);

        //remove element using index
        list.remove(2);

        System.out.println("After removing index 2: "+ list);

        //
        // Remove element using value
        list.remove(Integer.valueOf(40));

        System.out.println("After removing value 40: " + list);





    }
}
