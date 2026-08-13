public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println(a / b);

        System.out.println("Program Ends");
    }
}

// there will be error because your Java program is trying to divide a number by zero, which is not allowed in Java.
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Test.main(Test.java:6) .....like this



// Why java shows ArithmaticException?
//Java throws an ArithmeticException when an illegal arithmetic operation happens.
