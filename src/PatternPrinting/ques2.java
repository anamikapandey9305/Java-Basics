package PatternPrinting;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int column = sc.nextInt();

        for(int i=1; i<=row;i++){ // kitni lines hogi
            for(int j= 1; j<=column;j++){ // hr lines m kitne stars print honge
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
