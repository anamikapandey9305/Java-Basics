package CollectionFramework;
import java.util.ArrayList;

public class SearchingInArrayList2 {
    public static void main(String args[]) {
        ArrayList <Integer> list = new ArrayList<>();

        // Manual searching using for loop


        // // Adding elements to the list

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);



        // The element we want to search for

        int target = 30;

        // Initially, we have not found the element yet because the search hasn't started

        boolean found = false;


        // Visit each element off the list

        for(int i = 0;i<list.size();i++){

            // Checks whether the current element equals to the target

            if(list.get(i) == target){

                //Print the index where the element was found

                System.out.println("Element found at index:"+ i);





                //Mark that the element has been found


                found = true;


                //Stop researching

                break;


            }
        }
        // If found is still false, the element was not found
        if (!found) {
            System.out.println("Element not found");
        }

        //found = false — assume the element has not been found yet.



        //found = true — update the status when the element is found.



        //if (!found) — print the not-found message only if the element was never found



    }
}
