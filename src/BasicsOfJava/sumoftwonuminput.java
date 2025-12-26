package BasicsOfJava;
import java.util.Scanner;

public class sumoftwonuminput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");

        int firstno = sc.nextInt();
        System.out.println("Enter Second number:");
        int secno = sc.nextInt();
        int sum = firstno+secno;
        System.out.println("Sum of Two number is :" + sum);




    }
}
