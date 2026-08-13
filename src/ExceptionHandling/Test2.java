public class Test2 {
    public static void main(String[] args) {
        try { // The try block contains code that may produce an exception. means "Java, try executing this code. If something goes wrong, don't crash. Go to catch."


            int a = 10;
            int b = 0;


            System.out.println(a / b); // division by zero is not allowed.
            //Execution stops inside the try block.


        } catch (ArithmeticException e) { //The catch block handles the exception.
            System.out.println("Error" + e.getMessage()); //e: is a reference variable that stores the exception object. "If an ArithmeticException happens in try, execute this code."
        }
        System.out.println("Program continues..");

    }
}

