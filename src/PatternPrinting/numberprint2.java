package PatternPrinting;
import java.util.Scanner;

public class numberprint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
/*
In row 1, i = 1, so it prints 1 for every column in that row.

In row 2, i = 2, so it prints 2 for every column in that row.

And so on...

Let's say n = 4.

First iteration (i = 1)
Inner loop (j) runs 4 times → prints 1 1 1 1

Second iteration (i = 2)
Prints 2 2 2 2

Third iteration (i = 3)
Prints 3 3 3 3

Fourth iteration (i = 4)
Prints 4 4 4 4
 */