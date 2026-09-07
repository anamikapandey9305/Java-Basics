package Methods;

public class methodcalling {

    public static void main(String[] args) {

        // main() calls riyanshi()
        riyanshi();
    }

    public static void riyanshi() {

        // First print Ajay
        System.out.println("Ajay");

        // riyanshi() calls shravan()
        shravan();
    }

    public static void shravan() {

        // shravan() calls karan()
        karan();

        // After karan() finishes, execution comes back here
        System.out.println("Khushi");
    }

    public static void karan() {

        // karan() prints Yashika
        System.out.println("Yashika");
    }
}


//When a method calls another method, Java completes the called method first, then comes back and continues from the next line of the calling method
