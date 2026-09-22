package Arraysss;

public class elementsMultiply {
    public static void main(String args[]){

        int arr[] = {2,3,10,20};

        int n = arr.length;

        int multiply = 1;

        for(int i = 0;i< arr.length; i++){

             multiply  = multiply * arr[i];


        }
        System.out.println("Multiply of array: "+ multiply);


    }
}
