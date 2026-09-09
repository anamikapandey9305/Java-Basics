package Methods;

public class VoidMethods {

    // void means the method does not return any value
    static void greet(String name) {
        // Print the greeting
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // Calling the method and passing "Anamika" as an argument
        greet("Anamika");
    }
}