package Basic_Sorting;

public class InsertionSort {
     // Insertion Sort is a simple comparison-based sorting algorithm that sorts an array by inserting each element into its correct position one by one.

    public static void main(String[] args) {
         int [] arr = { 4,1,7,3,9,2, 0,8,8}; // integer array

         for(int i = 1; i< arr.length; i++){
              int j =i;
              while( j >0 && arr[j]<arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];

                  arr[j-1] = temp;
                  j--;
              }

         }
         for(int ele: arr) System.out.print(ele+ " ");
    }
}
