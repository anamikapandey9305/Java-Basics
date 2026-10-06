package BasicMaths;

public class Plindrome {

    static int reverseNum(int num) {
        int revNum = 0;

        while (num > 0) {
            int digit = num % 10;

            revNum = revNum * 10 + digit;

            num = num / 10;
        }

        return revNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = reverseNum(num);

        if (originalNum == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 1221;

        int revNum = reverseNum(num);
        System.out.println(revNum);

        System.out.println(isPalindrome(num));
    }
}