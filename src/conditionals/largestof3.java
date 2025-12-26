package conditionals;
import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = sc.nextInt();
        System.out.println("Enter second integer");
        int b = sc.nextInt();
        System.out.println("Enter third integer");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a + "is largest");
            }
            else{ // a <c
                System.out.println(c + "is largest");
            }
        }
        else{ // a<b
            if(b>c){
                System.out.println(b +"is largest");
            }
            else{ // b<c
                System.out.println(c +"is largest");
            }
        }


    }
}
