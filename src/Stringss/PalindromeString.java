package Stringss;

public class PalindromeString {

    public static void main(String[] args) {

        String str = "RACECAR";

        int n = str.length();

        String reverse = "";

        for(int i = n - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}