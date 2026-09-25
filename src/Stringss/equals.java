package Stringss;

public class equals {
    public static void main(String[] args) {

        String name1 = "Anamika";
        String name2 = "Anamika";
        System.out.println(name1.equals(name2));

        String a = new String ("Apple");
        String b =new String  ("Apple");
        System.out.println(a==b);

        //equals() checks whether the contents of two Strings are exactly the same, including uppercase/lowercase.

        //a ──→ [ "Apple" ]   ← Object 1

        //b ──→ [ "Apple" ]   ← Object 2

        //Object 1 ≠ Object 2 , so  a==b false
    }
}
