package conditionals;
import java.util.Scanner;

public class coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // given three points (x1,y1) , (x2,y2) , (x3,y3) WAP to check all the three points fall on one straight line.
        // y2-y2/x2-x1 = y3 -y2/x3-x2 must satisfy this condition
        double x1 = 1, x2 = 2, x3 = 3, y1 = 1, y2 = 2, y3 = 3;
        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y3 - y2) / (x3 - x2);
        if (m1 == m2) {
            System.out.println("The three points lie on a single line");
        }
        else{
            System.out.println("They don't lie ona same line");
        }
    }

}