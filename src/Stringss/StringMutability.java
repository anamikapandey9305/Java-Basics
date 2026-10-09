
package Stringss;

public class StringMutability {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello"); // Creating a StringBuilder

        sb.append("World");  // Add text at the end
        System.out.println(sb);

        sb.insert(5, "Java"); // Insert text at index 5
        System.out.println(sb);
    }
}
