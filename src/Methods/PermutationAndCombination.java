package Methods;

import java.util.Scanner;

public class PermutationAndCombination {

    // Method to calculate factorial of a number
    public static int fact(int x) {

        int f = 1;

        // Calculate x! = 1 × 2 × 3 × ... × x
        for(int i = 1; i <= x; i++) {
            f *= i;
        }

        // Return the factorial result
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take n and r as input
        int n = sc.nextInt();
        int r = sc.nextInt();

        // Calculate nCr (Combination)
        // Formula: nCr = n! / (r! × (n-r)!)
        int ncr = fact(n) / (fact(r) * fact(n - r));

        // Calculate nPr (Permutation)
        // Formula: nPr = n! / (n-r)!
        int npr = fact(n) / fact(n - r);

        // Print nCr and nPr
        System.out.println(ncr + " " + npr);
    }
}