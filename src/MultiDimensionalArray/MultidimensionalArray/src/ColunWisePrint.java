public class ColunWisePrint {
    public static void main(String[] args) {
        int [][] arr = {{6,0,4,5},{1,3,7,2},{9,9,4,2}};
        for(int j =0;j<arr[0].length;j++){
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }




    }
}
