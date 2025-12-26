package Loops;

public class oddnumbersdivisibleby3 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0) System.out.println(i);
        }
    }
}
/*Initialization (int i = 1):

The loop starts by setting i to 1.

This is the starting point of the loop.

Condition (i <= 100):

Before each iteration, it checks whether i is less than or equal to 100.

If true, the loop body runs.

If false, the loop stops.

Update (i++):

After executing the loop body, i is incremented by 1.

This ensures the loop moves to the next number.
The % (modulus operator) calculates the remainder when i is divided by 3.

If the remainder is 0, it means i is divisible by 3.

So:

When i = 3, 3 % 3 = 0 ✅ → Prints 3

When i = 4, 4 % 3 = 1 ❌ → Does not print

When i = 6, 6 % 3 = 0 ✅ → Prints 6
 */