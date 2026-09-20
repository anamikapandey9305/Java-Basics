package Methods;

public class LocalVariable {
    //A variable created inside a method is called a local variable.

    static void show(){

        int x = 10;// local variable
        System.out.println(x);
    }
    static void main(){
        show();

       // System.out.println(x); // Here x can be used only inside show().
    }



}
