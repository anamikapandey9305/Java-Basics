package Stringss;

public class contains {
    static void main() {
        String college = "GLA University";

        if (college.contains("GLA")) {
            System.out.println("GLA is present");
        }

        // contains:It is used to check whether a String contains a particular character or word.


        //contains() is case-sensitive
        String collegee = "GLA University";

        System.out.println(collegee.contains("gla")); // will give false
    }
}
