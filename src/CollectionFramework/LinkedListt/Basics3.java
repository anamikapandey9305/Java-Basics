package CollectionFramework.LinkedListt;
import java.util.LinkedList;


public class Basics3 {
    public static void main(String[]args) {

        //Let's learn how to create a LinkedList with different data types in Java.

        //Integer - stores whole numbers

        LinkedList<Integer> list = new LinkedList<>();

        list.add(55);
        list.add(65);
        list.add(95);
        list.add(105);


        //Strings - Stores text
        LinkedList<String> names = new LinkedList<>();
        names.add("Anamika");
        names.add("Radha");
        names.add("Krishna");

        //Double - Stores decimal numbers

        LinkedList<Double> prices= new LinkedList<>();
        prices.add(98.25);
        prices.add(34.45);


        //Character - Stores individual characters

        LinkedList<Character> letters= new LinkedList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');

        //Boolean - stores true or false
        LinkedList<Boolean> answers = new LinkedList<>();

        answers.add(true);
        answers.add(false);

        //Printing all linkelist
        System.out.println(list);
        System.out.println(names);
        System.out.println(prices);
        System.out.println(letters);
        System.out.println(answers);












    }
}
