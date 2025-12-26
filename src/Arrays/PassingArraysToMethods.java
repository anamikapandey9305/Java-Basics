package Arrays;

public class PassingArraysToMethods {
    public static void main(String[] args) {
        int x[] = {10,4,5,6,78};
        change(x);
        System.out.println(x[2]);

    }

    public static void change(int[] x) {
        x[2] =99; // changing the second index of the array


    }
}
