package Arraysss;

public class elementsSum {
    static void main(){

        int arr[]= {10,20,30,40,50,60};
        int n = arr.length;

        int sum= 0;

        for(int i =0; i<=n-1;i++){
            int value = arr[i];

            sum = sum + value;



        }
        //sum is ready to print
        System.out.println("Sum of all elements of array is: " +sum);

    }
}
