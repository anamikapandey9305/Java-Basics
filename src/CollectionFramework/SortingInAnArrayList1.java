package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class SortingInAnArrayList1 {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(50);
        list.add(10);
        list.add(70);


        Collections.sort(list);
        System.out.println(list);

    }
    //Java provides Collections.sort() to sort an ArrayList in ascending order.
}
