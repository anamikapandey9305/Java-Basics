package Loops;
import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for(int i = 1;i<=10; i=i+1){
            System.out.println(i*n);
        }
        //i = i + 1
        //
        //After each iteration, i increases by 1.
        //
        //This ensures that eventually, the loop will end.

    }
    //This line prints the multiplication of i and n.
    //
    //Example: If n = 5,
    //
    //First iteration: 1 * 5 = 5
    //
    //Second iteration: 2 * 5 = 10
    //
    //Third iteration: 3 * 5 = 15
    //
    //... and so on until 10 * 5 = 50.
}
