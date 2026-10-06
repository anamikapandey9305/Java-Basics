package BasicMaths;

public class PalindromeCheck {

    // Method to reverse a number
    static int reverseNum(int num) {

        // Variable to store the reversed number
        int reverse = 0;

        // Repeat until all digits are processed
        while (num > 0) {

            // Get the last digit
            int digit = num % 10;

            // Add the digit to the reversed number
            reverse = reverse * 10 + digit;

            // Remove the last digit from the number
            num = num / 10;
        }

        // Return the reversed number
        return reverse;
    }

    public static void main(String[] args) {

        int num = 12345;

        // Store the original number
        int original = num;

        // Call reverseNum() and store the result
        int reverse = reverseNum(num);

        // Print the reversed number
        System.out.println(reverse);
    }
}