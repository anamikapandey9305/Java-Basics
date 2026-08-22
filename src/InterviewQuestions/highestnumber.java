package InterviewQuestions;

public class highestnumber {
    public static void main(String args[]){

        int a = 10;
        int b = 25;
        int c = 35;

        if(a>=b && a>=c){
            System.out.println("Highest "+ a);
        }else if(b>=a && b>=c){
            System.out.println("Highest: "+ b);
        }else{
            System.out.println("Highest: "+c);
        }

    }
}
