package Stringss;

public class ChangeCase {
    public static void main(String[] args) {

        String college = "GLA University";

        System.out.println(college.toUpperCase()); //It converts all letters into capital letters.
        System.out.println(college.toLowerCase()); //It converts all letters into small letters.
    }
    //Original String doesn't change
   // Because toUpperCase() returns a new String.
    //The same applies to toLowerCase().

}