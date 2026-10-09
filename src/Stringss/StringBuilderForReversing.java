
package Stringss;
//StringBuilder is a class in Java used to create and modify strings without creating a new object for every modification.

public class StringBuilderForReversing {
    public static void main(String[] args) {

        String str = "RACECAR";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        if (str.equals(sb.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
