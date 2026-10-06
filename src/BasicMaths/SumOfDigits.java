package BasicMaths;

public class SumOfDigits {

    public static void main(String[] args) {

        int n = 2890;
        int sum = 0;

        while (n > 0) {

            // Get the last digit
            int digit = n % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove the last digit
            n = n / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}