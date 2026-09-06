
package Methods;
import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //System.out.println("Maximum of three is: "+ Math.max(Math.max(a,b),c)); // will give maximum

        System.out.println("Minimum of three is: "+Math.min(Math.min(a,b),c)); //will give minimum

    }
}
