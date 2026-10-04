package BasicMaths;

public class reverse {

    static int reverseNum(int num) {

        int revNum = 0;

        while (num != 0) {

            int digit = num % 10;

            revNum = revNum * 10 + digit;

            // remove last digit
            num = num / 10;
        }

        return revNum;
    }

    public static void main(String args[]) {

        int num = 1234;

        int revNum = reverseNum(num);

        System.out.println(revNum);
    }
}