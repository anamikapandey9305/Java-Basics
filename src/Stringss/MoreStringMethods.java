package Stringss;

public class MoreStringMethods {

    public static void main(String[] args) {

        String text = "Java Programming";

        // startsWith() checks whether the String starts with given text
        System.out.println(text.startsWith("Java")); // true

        // endsWith() checks whether the String ends with given text
        System.out.println(text.endsWith("Programming")); // true

        // lastIndexOf() finds the last occurrence of a character
        System.out.println(text.lastIndexOf('a')); // 3

        // replaceAll() replaces all matching characters or text
        String name = "Anamika123";
        System.out.println(name.replaceAll("[0-9]", "")); // Anamika

        // matches() checks whether the String matches a pattern
        String number = "12345";
        System.out.println(number.matches("[0-9]+")); // true

        // join() joins multiple Strings using a separator
        String result = String.join("-", "Java", "Spring", "React");
        System.out.println(result); // Java-Spring-React
    }
}