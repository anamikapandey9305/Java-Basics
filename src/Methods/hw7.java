package Methods;
// Write a method updateValue(int x) and verify that orignal variable in main () does not change

public class hw7 {

    static void updateValue(int x){
        x = 100;
    }

    static void main(String []args) {

        int nums = 10;



        System.out.println(nums);

        updateValue(nums);
        System.out.println(nums);

    }
}
