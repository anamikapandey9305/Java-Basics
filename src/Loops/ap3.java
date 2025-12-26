package Loops;

public class ap3 {
    public static void main(String[] args) {
        int a = 99;  // first term
        int d = -4;  // common difference

        // Keep printing until term is positive
        while (a > 0) {
            System.out.print(a + " ");
            a += d; // move to the next term
        }
    }
}
