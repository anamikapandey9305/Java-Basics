package CollectionFramework.LinkedListt.Traversal;

import java.util.LinkedList;

public class Basic1 {
    public static void main(String args[]){

        // Creating a linkedlist

        LinkedList<Integer> list = new LinkedList<>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Traverse the linkedList using for loop

        for(int i =0 ;i<list.size();i++){

            // get element at the current index

            System.out.println(list.get(i));
        }

    }
}
