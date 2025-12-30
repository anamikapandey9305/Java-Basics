package Basic_Sorting;

public class SelectionSort {

    //The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.
    // How it works:
    //
    //1.Go through the array to find the lowest value.
    //2.Move the lowest value to the front of the unsorted part of the array.
    //3.Go through the array again as many times as there are values in the array.

    public static void print(int[] arr){ // static method to print array element
        for(int ele : arr){ // enhanced for loop , iterates through each element(ele) in arr
            System.out.print(ele+" "); // will print each element followed by space
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[]arr = {5,-2,6,7,2,8,3,2};
        int n = arr.length;
        print(arr);
        for(int i =0;i<n-1;i++) { // outer loop( n-1 passes)
            int min = Integer.MAX_VALUE;
            int mindx = -1; // minimum value ki index jisse swap hoga,
            // hme minimum element ar uski position dhundhni hai.. toh hum position bhi update krte rhenge
            for (int j = i; j < n; j++) { // inner loop(finding minimum)
                // searches for the minimum element in the unsorted part
                // starts from index i beacuse elements before i are already sorted
                if (arr[j] < min) { // if a smaller element is found:
                    min = arr[j]; // Update min with that value
                    mindx = j;  // Update mindx with its index
                }

            }
            // swap
            int temp = arr[i]; // swaps element at index [i]
            arr[i] = arr[mindx]; // Minimum element found (mindx)
            arr[mindx] = temp; // This places the smallest element at the correct position

        }
        print(arr);








    }
}

// Time Complexity:
//
//Best, Average, Worst → O(n²)

// Space Complexity:
//
//O(1) (in-place sorting)

