
package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cf4 {
    public static void main(String[] args) {

        // Creating an ArrayList using the List interface
        List<Integer> list1 = new ArrayList<>();

        // add() adds an element at the end of the list
        list1.add(11);
        list1.add(12);
        list1.add(15);
        list1.add(26);
        list1.add(45);
        list1.add(80);

        // get(1) returns the element present at index 1
        // Index starts from 0, so it returns 12
        System.out.println(list1.get(1));

        // Printing the list before updating any element
        System.out.println("Before set" + list1);

        // set(0, 100) replaces the element at index 0 with 100
        // The first element 11 is replaced by 100
        // The size of the list remains the same
        list1.set(0, 100);

        // Printing the list after updating the element
        System.out.println("After set" + list1);


        //toArray
//       Object[] arr = list1.toArray();
//        for(Object obj: arr){
//            System.out.println(obj);
//        }

        // contains
//        System.out.println(list1.contains(100)); // will print true
//        System.out.println(list1.contains(10000)); // will print false
//


        list1.add(60);
        System.out.println("Printing entire list: "+ list1);

        //sort an arrylist
        Collections.sort(list1);
        System.out.println("Printing entire list after sorting: "+list1); // it will be sorted in ascending order



    }
}
