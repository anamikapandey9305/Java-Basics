
package Methods;

public class example1 {

    // This is a static method named print2katable
    // void means this method does not return any value
    static void print2katable() {

        // Loop will run from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Calculate 2 × i
            int ans = 2 * i;

            // Print the answer
            System.out.println("->" + ans);
        }
    }

    // IMPORTANT:
    // Normally Java program execution starts from:
    // public static void main(String[] args)
    //
    // Here you have written only "static void main()",
    // so this will NOT be the normal starting point of the program.
    static void main() {

        // Print "hi"
        System.out.println("hi");

        // Calling the print2katable() method
        // This will print the table of 2
        print2katable();

        // After print2katable() finishes,
        // this statement will execute
        System.out.println("byeee");
    }
}

