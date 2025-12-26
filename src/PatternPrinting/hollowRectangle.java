package PatternPrinting;
import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");

        int m = sc.nextInt(); // rows
        System.out.println("Enter number of columns:");
        int n = sc.nextInt(); // column
        for (int i = 1; i <= m; i++) { // outer loop (rows)
            for (int j = 1; j <= n; j++) { // inner loop (columns)
                if (i == 1 || i == n || j == 1 || j == n) {

                    System.out.print("* "); // border
                } else {
                    System.out.print("  "); // inside space



                }
                System.out.println();// move to next line after one full row
            }

        }
    }
}
