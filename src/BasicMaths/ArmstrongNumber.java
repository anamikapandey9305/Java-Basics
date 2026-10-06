package BasicMaths;

public class ArmstrongNumber {

    static  boolean  isArmstrongNumber(int num){
        int sum = 0;
        int orignalNum=num;

        while(num!=0){
            int digit = num%10;
            int cubeOfdigit = digit*digit*digit;
            sum = sum+ cubeOfdigit;

            num = num/10;




        }
        if(sum==orignalNum){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[]args){
        System.out.println(isArmstrongNumber(155));


//        int n = 153;
//        int orignal = n;
//        int sum = 0;
//
//        int digits = 3;
//
//        while(n>0){
//            int digit = n%10;
//            sum = sum + digit * digit *digit;
//
//            n = n/10;
//        }
//        if(sum==orignal){
//            System.out.println("Armstrong number");
//        }
//        else{
//            System.out.println("Not a Armstrong number");
//        }

    }
}
