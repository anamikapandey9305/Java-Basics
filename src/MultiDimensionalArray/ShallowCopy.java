package MultiDimensionalArray;

public class ShallowCopy {
    public static void main(String[] args) {
        // a.clone() is a built-in Java method used to make a copy of an array.
        // If you have an array named a, then: int[] b = a.clone();
        //Create a new array b
        // Copy all elements of array a into array b
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = a.clone();   // shallow copy

        b[0][0] = 99;  // modify b

        System.out.println("a[0][0] = " + a[0][0]); // prints 99
        System.out.println("b[0][0] = " + b[0][0]);
    }
}
//Even though you changed b,
//a also changes — because both refer to the same inner arrays.





