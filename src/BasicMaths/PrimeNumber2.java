package BasicMaths;

public class PrimeNumber2 {
    public static void main(String[] args) {

        int n = 5; // Number jisko prime check karna hai

        boolean isPrime = true; // Pehle maan liya number prime hai

        // 2 se n-1 tak check karenge
        for (int i = 2; i < n; i++) {

            // Check karo ki n, i se completely divide hota hai ya nahi
            if (n % i == 0) {

                isPrime = false; // Divisor mil gaya, number prime nahi hai
                break; // Loop ko turant stop kar do
            }
        }

        // Final result check karna
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}