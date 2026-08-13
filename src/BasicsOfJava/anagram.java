import java.util.Arrays;

public class anagram {
    public static void main(String args[]){


        //Anagram woh words hote hain jisme dono strings ke characters same hote hain, bas unka order alag hota hai.


        String str1 = "Listen";
        String str2 = "Silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str1.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }



    }
}
