package Loops;

public class continuein {
    public static void main(String[] args) {
       for (int i=1;i<=10;i++) {
           if(i==5) {
               System.out.println("Skipping i = " + i);
               continue; // skip the rest of this iteration.
           }
           System.out.println("i = "+i);

           }
       }
    }
 /*
 When i = 5, continue is executed.

The System.out.println("i = " + i); statement below it is skipped, and the loop jumps to the next iteration (i = 6).

Unlike break, the loop keeps running after skipping that iteration.
  */
