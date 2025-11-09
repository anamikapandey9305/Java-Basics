package MultiDimensionalArray;

public class DeepCopy {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = new int[a.length][];   // create outer array

        // deep copy
        for (int i = 0; i < a.length; i++) {
            b[i] = new int[a[i].length];   // create each inner array
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];         // copy each element
            }
        }

        b[0][0] = 99;  // modify b

        System.out.println(a[0][0]);   // prints 1 (NOT changed)
        System.out.println(b[0][0]);   // prints 99
    }
}
//Changing b does NOT change a.



