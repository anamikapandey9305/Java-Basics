package ExceptionHandling;

public class CustomException {

    public static void main(String[] a) {

        int balance = 5000;
        int amount = 1000;

        try {

            if (amount > balance) {

                // Create and throw our custom exception
                throw new InsufficientBalanceException(
                        "Insufficient Balance"
                );
            }

            System.out.println("Withdrawal Successful");

        } catch (InsufficientBalanceException e) {

            // Print the exception message
            System.out.println(e.getMessage());
        }
    }
}