public class sum {
    public static void main(String[] args) {
        int [][] arr = {{6,0,2,7},{1,3,4,5},{4,6,7,8}}; // creating 2D array
        int sum = 0;
        for(int i = 0; i<arr.length;i++){ // inner loop(arr.length = 3) means 3 rows
            for(int j = 0;j<arr[0].length;j++){ // outer loo (arr.[0].length) means 4 columns
                sum+=arr[i][j]; // wil add first row 1 - 6+0+2+7=15... row2- 1 + 3 + 4 + 5 = 13, 4 + 6 + 7 + 8 = 25

            }

        }
        System.out.println(sum); // 15 + 13 + 25 = 53


    }
}
