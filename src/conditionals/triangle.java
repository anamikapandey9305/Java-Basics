package conditionals;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take 3 numbers input and tell if they can be sides of triangle
        System.out.println("Enter first side of triangle : ");
        int a = sc.nextInt();
        System.out.println("Enter second side of triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter third side of triangle:");
         int c = sc.nextInt();
         // As we know for formation of triangle sum of two sides should always greater than the third side.
         if(a+b>c && b+c>a && a+c>b){
             System.out.println("Valid triangle");
         }
         else{
             System.out.println("Invalid Triangle");
         }
    }
}
