package Methods;

public class StaticMethods {

    // static method belongs to the class
    // so we don't need to create an object
    static void greet() {
        System.out.println("Hello Anamika");
    }

    public static void main(String[] args) {

        // Calling the static method directly
        greet();
    }
}