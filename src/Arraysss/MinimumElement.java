package Arraysss;

public class MinimumElement {
    public static void main(String[]args){

        int arr[] = {24,78,54,34,20,12};

        int n = arr.length;

        int Minimum  = arr[0];

        for(int i = 1 ; i<n;i++){
            if(arr[i]<Minimum){
                // update minimum

                Minimum = arr[i];
            }
        }
        System.out.println("Minimum element in the array is :"+ Minimum);

    }
}
