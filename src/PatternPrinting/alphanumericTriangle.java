package PatternPrinting;
import java.util.Scanner;
public class alphanumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        int num = 1;       // For numbers
        char ch = 'A';     // For alphabets

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // If the row is odd -> print numbers
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }
            // If the row is even -> print letters
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                    // Wrap around to 'A' after 'Z'
                    if (ch > 'Z') {
                        ch = 'A';
                    }
                }
            }
            System.out.println(); // move to next line
        }
    }
}
