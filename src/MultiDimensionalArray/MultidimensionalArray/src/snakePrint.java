public class snakePrint {
    public static void main(String[] args) {
        int[][] arr = {
                {6, 0, 4, 5},
                {1, 3, 7, 2},
                {9, 9, 4, 2}
        };

        for (int i = 0; i < arr.length; i++) {
            // Even row → left to right
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            // Odd row → right to left
            else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
