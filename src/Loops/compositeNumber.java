package Loops;
import java.util.Scanner;

public class compositeNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // Create Scanner object or user
        System.out.println("Enter a number:");
        int n = sc.nextInt(); // Read the number entered by ht user.
        int x = 0; // 0 means prime

        for(int i=2;i<=n-1;i++){ // Check factors from 2 to n-1.
            if(n%i==0) { // If n is divisible by i (factor found)
                System.out.println("Composite number");
                break; // exit the loop after finding first factor.


            }
        }
        System.out.println("Composite Number");
        System.out.println("Prime Nmuber");





    }
}
 /*
 Composite number = A number that has more than two factors.

Example:

6 → Factors: 1, 2, 3, 6 → Composite

7 → Factors: 1, 7 → Prime (NOT composite)

1 → Only factor is 1 → Neither prime nor composite

So, to check if a number is composite, we only need to see if it has a factor other than 1 itself.


% is the modulus operator → it gives the remainder of the division.

If n % i == 0, it means i divides n completely → i is a factor.


  */