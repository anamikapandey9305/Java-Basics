package Arrays;
import java.util.ArrayList;
import java.util.Collections;
//n Java, an ArrayList is a resizable array — meaning, unlike regular arrays, its size can grow or shrink dynamically as elements are added or removed. It is a part of the java.util package.
 // Duplicates are allowed.
 // Null values can also be stored

public class ArrayListsinJava{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(4);
        System.out.println(arr.get(2));
        // arr[3]= 50; // ni kr skte

        // change element
        arr.set(3, 50); // means it is , arr[3] =50
        System.out.println(arr); // not traversing the array by ourselves
        int n = arr.size(); // arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // 25 21 18 50
        arr.add(78); // 25 21 18 50 78
        arr.add(1,100); // index 1 p 100 ghusa dega
        System.out.println(arr);
        arr.remove(0); // index 0 remove krdega
        arr.remove(arr.size() - 1); // last element ko remove krega
        System.out.println(arr);



        int i =0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j)); // i'th index p j'th chiz daalni hai
            arr.set(j,temp);
            i++;
            j--;


        }

        //arr.clear(); // puri array list khali ho jti hai means 0 elements
       // Collections.reverse(arr); //
        System.out.println(arr);
        ArrayList<Character> arr2 = new ArrayList<>();


    }
}
