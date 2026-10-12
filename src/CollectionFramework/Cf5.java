package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class Cf5 {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(30);

        // Sort in descending order: we use collections.reverseOrder
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
        //- Collections.sort(list) → Ascending order (smallest to largest)
       // - Collections.sort(list, Collections.reverseOrder()) → Descending order (largest to smallest)


    }

}
