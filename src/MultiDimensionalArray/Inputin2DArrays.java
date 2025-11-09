package MultiDimensionalArray;
 import java.util.Scanner;

public class Inputin2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [3][4];
        // tsking input
        for(int i =0;i<arr.length;i++){ // i=rows
            for(int j=0;j<arr[i].length;j++){ // j= columns
                arr[i][j]=sc.nextInt(); //take input
            }
            System.out.println();
        }
        // printing array
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
// arr.length → number of rows
//
//arr[i].length → number of columns in row i
