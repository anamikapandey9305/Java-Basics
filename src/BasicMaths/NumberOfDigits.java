package BasicMaths;

public class NumberOfDigits {

    public static void main(String[] args) {

        int n = 1234566768;

        // Variable to count digits
        int count = 0;

        // Repeat until number becomes 0
        while (n > 0) {

            // Count one digit
            count++;

            // Remove the last digit
            n = n / 10;
        }

        System.out.println("Number of digits: " + count);
    }
}