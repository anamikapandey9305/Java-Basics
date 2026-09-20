package Methods;

public class CallByValue {
    //Call by value means: when we pass a variable to a method, a copy of its value is passed.


    static void change(int x){
        x = 20;

    }
    static void main(){
        int a = 10;

        System.out.println("Before:"+ a);
        change(a); // value of a is passed

        System.out.println("After:"+ a);
    }
}

//Call by value means a copy of the actual value is passed to the method, so changes made to the parameter do not affect the original variable.

