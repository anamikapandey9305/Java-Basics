package Loops;
import java.util.Scanner;
// Factorial of a number

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact  = 1;  // variable to store factorial

        // loop from 1 to n
        for(int i =1; i<=n; i++){
            fact *= i; // multiply fact by i (fact*i)

        }
        System.out.println(fact);

    }
}
 /*
 What is Factorial?

The factorial of a number n (written as n!) is the product of all positive integers from 1 to n.

Formula:



n!=n×(n−1)×(n−2)×...×2×1

Example:
For n = 5


5!=5×4×3×2×1=120
  */