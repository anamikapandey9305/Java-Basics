package Stringss;

public class split {
    public static void main(String[]args){

        String name = "My name is Anamika";
        String[] word = name.split(" ");
        for(String str:word){
            System.out.println(str);
        }
    }

}
