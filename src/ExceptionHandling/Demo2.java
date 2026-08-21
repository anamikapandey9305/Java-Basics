package ExceptionHandling;

public class Demo2 {
    public static void main(String a[]) {

        // Initially, both variables have the value 0
        int i = 0;
        int j = 0;

        try {
            // We are trying to divide 18 by i.
            // But i = 0, so this causes ArithmeticException
            // because division by zero is not allowed.
            j = 18 / i;

            // This line will NOT execute because the exception
            // occurs on the previous line.
            System.out.println("Bye");
        }

        catch (Exception e) {
            // When an exception occurs inside try,
            // Java immediately comes to the catch block.
            System.out.println("Something went wrong");
        }

        finally {

            System.out.println("I will be executed everytime");
            // The finally block is executed whether an exception
            // occurs or not.
            //
            // It is commonly used for cleanup tasks such as
            // closing files, database connections, etc.
            // finally makes sense as whenever we try to close resource. thats where we use finally
        }
    }
}