package MultiDimensionalArray;

public class InputOutput {
    public static void main(String[] args) {
        //int[][] arr= new int[3][4];
        int[][] arr= {{6,0,2,7},{1,3,7,2},{9,9,4,5}}; // we can  also initialise 2D array like this
       // System.out.println(arr.length+" "+arr[0].length); // no. of rows btaega, arr of [0] ki jo length hogi vo number of columns hogi
        for(int i =0;i<3;i++){
            for(int j =0; j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
