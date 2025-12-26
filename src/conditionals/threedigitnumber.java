package conditionals;
import java.util.Scanner;

public class threedigitnumber {
    public static void main(String[] args) {
        //Take a integer input and tell if it is a three digit number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("It is three digit number:");
        }
        else{
            System.out.println("It is not a three digit number");
        }


    }
}
