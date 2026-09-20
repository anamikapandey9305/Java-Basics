package Methods;

public class hw5 {

    static double calculatePercentage(int obtained, int total){

        return ((double)obtained/total)*100;
    }
    public static void main(String[]args){

        System.out.println(calculatePercentage(403,600));
    }
}
