
package PatternPrinting;
import java.util.Scanner;

public class alphabetsmallCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {           // loop for rows
            for (int j = 1; j <= n; j++) {       // loop for printing letters in each row
                if (i % 2 == 0) {
                    // Even row → Uppercase
                    System.out.print((char)(i + 64) + " "); // 'A' = 65
                } else {
                    // Odd row → Lowercase
                    System.out.print((char)(i + 96) + " "); // 'a' = 97
                }
            }
            System.out.println();
        }
    }
}
