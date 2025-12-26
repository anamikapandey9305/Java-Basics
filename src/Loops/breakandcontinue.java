package Loops;

public class breakandcontinue {
    public static void main(String[] args) {

        //1. break Statement
        //
        //The break statement immediately exits the loop (or switch statement) and stops its execution, no matter if the loop condition is still true.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at i = " + i);
                break;  // exit the loop when i is 5
            }
            System.out.println("i = " + i);
        }
    }
}

/*
The loop runs normally from i = 1 to i = 4.

When i becomes 5, break is executed.

The loop stops completely and control moves outside the loop.

continue Statement

The continue statement skips the current iteration of the loop and moves to the next iteration, without stopping the entire loop.



 */