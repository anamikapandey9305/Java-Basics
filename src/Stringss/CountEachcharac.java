package Stringss;

public class CountEachcharac {
    public static void main(String args[]){

        String str = "Anamika";

        int count = 0;

        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println("length of string :"+ count);


    }
}
