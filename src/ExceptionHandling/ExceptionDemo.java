package ExceptionHandling;

public class ExceptionDemo {

    public static void main(String[] args) {

        // Two integer variables
        int a = 10;
        int b = 0;

        // try block contains code that may cause an exception
        try {

            // We are trying to divide 10 by 0
            // This will cause ArithmeticException
            int result = a / b;

            // This line will NOT execute if an exception occurs above
            System.out.println("Result: " + result);

        }

        // catch block handles the exception
        // ArithmeticException occurs because we cannot divide by zero
        catch (ArithmeticException e) {

            // Print a friendly message instead of allowing the program to crash
            System.out.println("Cannot divide by zero");

        }

        // After the exception is handled,
        // the program continues executing from here
        System.out.println("Program completed");
    }
}