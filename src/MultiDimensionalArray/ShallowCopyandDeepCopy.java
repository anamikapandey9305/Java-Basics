package MultiDimensionalArray;

public class ShallowCopyandDeepCopy {
    //A copy means creating another array from an existing array.
    //A shallow copy does NOT copy the actual elements,it only copies the reference of the array.
    //so both arrays point to the same memory location.
    // Deep copy creates a completely new array
    // Elements are copied value-by-value
    public static void main(String[] args) {
        int[][] arr= {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        int[][] brr= {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        brr[1][3]=20;
        System.out.println(arr[1][3]);

    }
}
