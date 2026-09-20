package Methods;

// create an overloaded method display() with one int parameter or one string parameter

public class hw6 {

    static void display(int num){
        System.out.println(num);
    }
    static void display(String text){
        System.out.println(text);
    }

    static void main(String []args) {

        display(10);
        display("hello");


    }
}
