package Loops;
import java.util.Scanner;
// Dsiplay this AP 2,5,8,11....upto n terms
// a = a+(n-1)d

public class ap {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        for(int i= 2; i<=3*n-1;i+=3){
            System.out.print(i+" ");
        }

    }
}
