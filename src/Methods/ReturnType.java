package Methods;

public class ReturnType {

    // int means this method will return an integer value
    public static int anamika() {

        System.out.println("Radhaa");
        System.out.println("Krishna");

        // Returning the value 4
        return 4;
    }

    public static void main(String[] args) {

        // Calling anamika()
        // The returned value 4 is printed
        System.out.println(anamika());
    }
}
//Here int is the return type.

//It means:
//"This method must return an integer value."

//void → returns nothing
//int  → returns an integer
//double → returns a decimal value
//String → returns a String
//boolean → returns true/false