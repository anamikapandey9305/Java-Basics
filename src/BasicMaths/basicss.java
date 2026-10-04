package BasicMaths;

public class basicss {
    static void printDigits(int num){
        // agr mere num ki value zero hogyi toh mai ruk jaunga
        // agr mere num ki value zero nhi hai toh mmai processing krta rhunga

        while(num!=0){
            int digit = num%10;
            System.out.print (digit);
            // last digit remove
            num = num/10;
        }

    }
    static void main() {
        int num = 53127;
        printDigits(num);

    }
}
