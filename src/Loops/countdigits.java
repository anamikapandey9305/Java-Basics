package Loops;
import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        //  Counts the digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n==0) n=9;
        int count = 0;
        while(n!=0){ //jbtk zero na aa jae

            n/=10; // tbtk 10 se divide hoga
            count++; // count ki value jitni baar divide hoga bdhti jaegi
        }
        System.out.println( "Count of the number is  "+ count);


    }

}
