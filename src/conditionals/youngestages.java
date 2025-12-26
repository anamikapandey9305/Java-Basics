package conditionals;
import java.util.Scanner;

public class youngestages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Ram: ");
        int Ram = sc.nextInt();
        System.out.println("Enter age of Shyam: ");
        int Shyam = sc.nextInt();
        System.out.println("Enter age of Ajay:");
        int Ajay = sc.nextInt();
        if (Ram < Shyam && Ram < Ajay) {
            System.out.println("Ram is youngest  ");
        }


        if(Shyam< Ram && Shyam <Ajay ){
            System.out.println("Shyam is younest");
        }
        if(Ajay<Ram && Ajay<Shyam){
            System.out.println("Ajay is youngest");
        }



    }
}
