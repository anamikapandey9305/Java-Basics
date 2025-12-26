package conditionals;
import java.util.Scanner;

public class notdivisible15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input a number which is divisible by 3 and 5 but not 15
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!= 0){
                System.out.println("The number is divisible by 3 and 5 but not 15");

            }
            else{
                System.out.println("Not matching the required condition");
            }

        }
        else{
            System.out.println("Not matching the required condition");

        }
    }
}
