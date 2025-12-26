package PatternPrinting;
import java.util.Scanner;

public class FlippednumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // outer loop(rows)
            for(int j=n;j>=i;j--){ // inner loop(columns)
                System.out.print(j+" ");
            }
            System.out.println(); // move to next line
        }
    }
}
