package Loops;
import java.util.Scanner;


public class sumofdigits {
    public static void main(String[] args) {
        // print sum of digits
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum+=(n%10);
            n/=10;


        }
        System.out.println(sum);


    }
}
