package conditionals;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println();
        if(n%2==0){ // n is even
            System.out.println(" The number you Enter is Even Number");
        }
        if(n%2!=0){ // n odd hai
            System.out.println("The number you enterd is odd");
        }







    }

}
