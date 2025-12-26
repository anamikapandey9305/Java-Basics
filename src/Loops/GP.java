package Loops;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        // display this GP 1,2,4,8 upto n terms
        // an = ar^n-1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int a = 1;
        int r = 2;
        for (int i = 1;i<=n;i++){
            System.out.print(a + " ");
            a*=r; // a = a*r
        }
    }
}
