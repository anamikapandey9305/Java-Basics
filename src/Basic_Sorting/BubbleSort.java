package Basic_Sorting;

public class BubbleSort {
    public static void print(int[]arr){
        // Bubble Sort is an algorithm that sorts an array from the lowest value to the highest value.
        // 1. Go through the array, one value at a time.
        // 2.For each value, compare the value with the next value.
        // 3. If the value is higher than the next one, swap the values so that the highest value comes last


    for(int ele : arr){
        System.out.print(ele+" ");
    }
        System.out.println();

    }
    public static void main(String[] args) {
        int[]arr = {5,-2,6,7,2,8,3,2};
        int n = arr.length;
        print(arr);
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);


    }
}
