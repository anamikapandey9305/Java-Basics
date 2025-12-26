package Loops;
import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        // Take 'n' as input from user and print the following sequence..
        // 1
        // n
        // 2
        //n-1
        // 3
        //n-2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int start = 1; // beginning of sequence
        int end = n; //end of sequence

        while(start<=end){
            if (start == end) {

                System.out.println(start); //print only one value when they meet

            } else{
                System.out.println(start + " "+end+" ");
            }
            start++;
            end--;
        }






    }
}
