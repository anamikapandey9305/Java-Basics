package Stringss;

public class AllStringMethods {

    public static void main(String[] args) {

        // length() counts the total number of characters
        String name = "Anamika";
        System.out.println(name.length());


        // charAt() gives the character at a particular index
        System.out.println(name.charAt(0));


        // equals() checks whether two Strings have the same content
        String a = "Java";
        String b = "Java";
        System.out.println(a.equals(b));


        // equalsIgnoreCase() compares Strings without checking case
        String x = "Java";
        String y = "java";
        System.out.println(x.equalsIgnoreCase(y));


        // contains() checks whether a word or character exists
        String college = "GLA University";
        System.out.println(college.contains("GLA"));


        // toUpperCase() converts the String to uppercase
        System.out.println(name.toUpperCase());


        // toLowerCase() converts the String to lowercase
        System.out.println(name.toLowerCase());


        // indexOf() finds the index of a character
        System.out.println(name.indexOf('m'));


        // substring() gets a part of the String
        // start index is included, end index is excluded
        System.out.println(name.substring(0, 3));


        // replace() replaces a character or text
        System.out.println(name.replace('a', 'x'));


        // trim() removes spaces from the beginning and end
        String text = "   Hello Java   ";
        System.out.println(text.trim());


        // isEmpty() checks whether the String has zero characters
        String empty = "";
        System.out.println(empty.isEmpty());


        // isBlank() checks whether the String is empty or contains only spaces
        String blank = "   ";
        System.out.println(blank.isBlank());


        // split() divides a String into multiple parts
        String fruits = "Apple,Mango,Banana";
        String[] result = fruits.split(",");

        for (String fruit : result) {
            System.out.println(fruit);
        }


        // valueOf() converts another data type into a String
        int number = 100;
        String str = String.valueOf(number);
        System.out.println(str);


        // concat() joins two Strings
        String firstName = "Anamika";
        String lastName = "Pandey";

        System.out.println(firstName.concat(" ").concat(lastName));
    }
}