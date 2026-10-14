package CollectionFramework;
import java.util.ArrayList;

public class TraversalInArrayList {
    // traversal using normal for loop
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        for(int i =0; i<list.size();i++){ //i < list.size() — continues while i is less than 4.
//
//            System.out.println(list.get(i)); //list.get(i) — retrieves the element at index i.
//
//        }


        // using enhanced for loop

        for (int num : list) {
            //int num — variable that stores the current element.
            //list — the ArrayList being traversed.
            System.out.println(num);
        }

    }
}
