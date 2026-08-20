package ExceptionHandling;

public class ThrowDemo {

    public static void main(String[] args) {

        int age = 20;

        // Check if age is less than 18
        if (age < 18) {

            // Manually throw an exception
            throw new IllegalArgumentException("Age must be 18 or above");
        }

        // This runs only if age is 18 or more
        System.out.println("You are eligible");
    }
}