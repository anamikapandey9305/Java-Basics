package Methods;

// create a method isEven(int number) that returns true if a number is even

public class hw3 {

    static boolean isEven(int num){

        return num%2==0;

    }
    public static void main(String[] args){
        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }
}
