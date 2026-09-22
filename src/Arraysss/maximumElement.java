package Arraysss;

public class maximumElement {
    public static void main(String[]args){

        int arr[] = {20,55,67,89,02,43};
        int n= arr.length;

        int maxValue = arr[0];
        //compare krungi maxvalue ko array k har element k sth

        for(int i = 0; i<n-1;i++){
            if(arr[i]>maxValue){
                //update maxValue

                maxValue = arr[i];

            }

        }
        System.out.println("Maximum elemment of the array is: "+maxValue);



    }
}
