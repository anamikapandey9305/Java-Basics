package Loops;
import java.util.Scanner;

public class ReverseOfno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // user input number
        int r = 0; // Variable to store reverse


        while(n!=0){
            r *=10;  // shift digits of r to the left
            r +=(n%10); // add the last digit of n to r
            n /=10; // remove the last didgit from n


        }
        System.out.println(r); // print reversed number


    }
}
