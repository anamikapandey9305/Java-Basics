package Palindrome;

public class PalindromeCheck {
    public static void main(String[]args){

        String name = "anamika";

        String reverse = "";

        for(int i=name.length() -1;i>=0;i--){
            reverse = reverse+ name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

}
