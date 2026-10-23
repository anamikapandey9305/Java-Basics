package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;


public class Sorting2 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(60);
        list.add(89);
        list.add(34);
        list.add(45);


        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

        //For descending order, use Collections.reverseOrder().


    }
}

