package Loops;

public class ASCII {
    public static void main(String[] args) {
        // print all alphabets with their corresponding ASCII values.
        for(int i =65;i<=90;i++){
            System.out.println((char)i+ " "+i);

        }

    }

}
 /*
 Initialization: int i = 65 → Loop starts at ASCII value 65 (A).

Condition: i <= 90 → Loop continues until it reaches ASCII value 90 (Z).

Increment: i++ → Adds 1 to i after each iteration, moving to the next letter.



char)i → Converts the integer i into its character representation.

Example: If i = 65, then (char)65 = 'A'.

+ " " + i → Adds a space " " and then prints the integer value.



if you don't use (char), Java will print only the integer (like 65 instead of A).

The cast (char) tells Java:
"Interpret this number as its character representation."
  */