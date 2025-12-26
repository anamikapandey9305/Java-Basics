package Arrays;

public class ForEachLoop {
    //n Java, a for-each loop (also called the enhanced for loop) is used to iterate over arrays or collections (like ArrayList, HashSet, etc.) without using an index variable.It automatically goes through each element — from the first to the last — making code simpler and less error-prone than a traditional for loop.
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};
       // for( int ele: arr){
       //     System.out.print(ele+" ");
      //  }
        for(int i=0;i< arr.length;i++){
            arr[i] *= 2;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

}
