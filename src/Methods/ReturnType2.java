package Methods;

public class ReturnType2 {

    // This method takes one integer parameter 'a'
    // and returns an integer value
    public static int madhav(int a) {

        // Step 1: Print Lata
        System.out.println("Lata");

        // Step 2: Check whether a is greater than 0
        if (a > 0)

            // If condition is true, return 5
            return 5;

        else

            // If condition is false, return 10
            return 10;
    }

    public static void main(String[] args) {

        // Step 3: Call madhav() and pass 7
        // So inside madhav():
        // a = 7
        int x = madhav(7); // x ki value 5 ho jaegi

        // Step 4: madhav(7) returns 5
        // Therefore:
        // x = 5

        // Step 5: Add 3 + x
        // 3 + 5 = 8
        System.out.println(3 + x);
    }
}