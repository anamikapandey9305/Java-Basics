package PatternPrinting;
import java.util.Scanner;

public class alphabetCapitalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // outer loop (rows)
            for(int j=1;j<=n+1-i;j++){ // inner loop(columns)
                System.out.print((char)(i+64)+" "); // for printing thr same letter
            }
            System.out.println();
        }
    }
}
