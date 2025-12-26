package conditionals;
import java.util.Scanner;

public class absolutevalue {
    public static void main(String[]args){
        // Take the integer input and print the absolute value of that integer
        // Absolute value of negative number is its positive number.
         // like  |-4| = 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int n = sc.nextInt();
        if(n<0){ // n is lees then 0 which means negative
            n = n* (-1);

        }
        System.out.println("The absolute value is :"+ n);







    }
}
