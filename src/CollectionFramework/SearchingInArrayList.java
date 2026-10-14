package CollectionFramework;
import java.util.ArrayList;

public class SearchingInArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);

        System.out.println(list.contains(30)); // returns true because 30 exists.
        System.out.println(list.contains(50)); // returns false because 50 does not exist.
        System.out.println(list.indexOf(20)); // finds the first occurence,Why 1? Because ArrayList indexing starts from 0.
        //If the element doesn't exist, indexOf() returns -1.

        System.out.println(list.indexOf(99));

        System.out.println(list.lastIndexOf(20)); // find the last occurrence

    }
}