package PatternPrinting;
import java.util.Scanner;

public class alphabetsquaresmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){ // outer loop for rows
            for(int j=1;j<=n;j++){// inner loop for columns
                System.out.print((char)(j+96)+" ");

            }
            System.out.println();
        }

    }
}
