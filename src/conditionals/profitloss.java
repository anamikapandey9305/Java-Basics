package conditionals;
import java .util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price of an item: ");
        int CP = sc.nextInt();
        System.out.println("Enter the Selling Price of item: ");
        int SP = sc. nextInt();

        if(SP>CP){

            System.out.print( " You made a Profit of rupees " );
            System.out.println(SP-CP);
        } else{
            System.out.println(" You incurred a Loss of rupees ");
            System.out.println(CP-SP);
        }


    }
}
