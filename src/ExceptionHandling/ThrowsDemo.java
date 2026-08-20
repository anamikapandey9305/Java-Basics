package ExceptionHandling;

public class ThrowsDemo {

    // This method accepts age as a parameter.
    // "throws Exception" means this method may throw an Exception.
    // The caller of this method must handle it or declare it.
    static void checkAge(int age) throws Exception {

        // Check whether the age is less than 18
        if (age < 18) {

            // Manually create and throw an Exception.
            // "throw" actually throws the exception.
            throw new Exception("Age must be 18 or above");
        }

        // This line executes only when age is 18 or more
        System.out.println("Eligible");
    }

    // Program execution starts from the main() method
    public static void main(String[] args) throws Exception {

        // Calling checkAge() and passing 15 as the argument
        checkAge(15);
    }
}