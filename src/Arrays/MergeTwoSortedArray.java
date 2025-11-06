package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        //We use three pointers:
        //
        //i → points to current element of array a
        //
        //j → points to current element of array b
        //
        //k → points to current index of array c (final merged array)

        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 7, 8};
        int[] c = new int[a.length + b.length];

        merge(c, a, b);

        for (int ele : c)
            System.out.print(ele + " ");
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        // Step 1: Compare elements of a and b
        //
        //While both arrays still have elements:
        //
        //Look at a[i] and b[j]
        //
        //Whoever is smaller goes into array c
        //
        //Move that pointer ahead

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];


            }
            //Example:
            //
            //Compare 2 and 1 → 1 is smaller → put 1 in c
            //
            //Compare 2 and 3 → 2 is smaller → put 2 in c
        }

        // After the main loop ends,
        //
        //one of the arrays will still have some elements left.
        //
        //Just copy all of them to c.

        // Copy remaining elements
        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
