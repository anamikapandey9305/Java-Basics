public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[][] arr = {{2,4,5,6,7},{4,6,7,8,7},{9,9,7,8,6}};
        int[][] brr = {{2,4,5,6,7},{4,6,7,8,7},{9,9,7,8,6}};
        brr[1][3] = 20;
        System.out.println(arr[1][3]);




    }
}
