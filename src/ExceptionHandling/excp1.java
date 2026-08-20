package ExceptionHandling;

public class excp1 {

    public static void main(String[] args) {

        // Creating an array with 3 elements
        int[] numbers = {10, 20, 30};

        try {
            // Valid indexes are 0, 1 and 2
            // Index 5 does not exist, so it will cause an exception
            System.out.println(numbers[5]);
        }

        // Handling ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        // Program continues after exception is handled
        System.out.println("Program completed");
    }
}