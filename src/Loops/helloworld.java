package Loops;
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        // print hello world n times. Take 'n' as input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        for (int i= 1;i<=n;i=i+1) {
            System.out.println("Hello World!");
        }
    }
}
