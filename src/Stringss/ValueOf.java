package Stringss;

public class ValueOf {
    public static void main(String[] args) {

        int num = 100;

        // valueOf() converts int into String
        String str = String.valueOf(num);

        System.out.println(str);
        System.out.println(str + 50);
    }
}