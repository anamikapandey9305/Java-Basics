package conditionals;
import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = sc.nextInt();
        System.out.println("Enter second integer");
        int b = sc.nextInt();
        System.out.println("Enter third integer");
        int c = sc.nextInt();
        if(a>b && a>c){ // a is max
            System.out.println( a+ " is largest");
        }
         else if(b>a && b>c){ // b is max
            System.out.println(b +" is largest");
        }
         else{ // c has to be the largest
         System.out.println(c +" is largest");
        }


    }
}
