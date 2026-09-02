package Streams;
import java.io.FileOutputStream;

public class OutputStreamExample {
    public static void main(String args[]){

        try{
            FileOutputStream fout = new FileOutputStream("D:\\Java\\Java-Basics\\src\\Streams\\testout.txt");

            String s = "Have you learnt OutputStream?"; //This is the text we want to write into the file.

            //FileOutputStream works with bytes, so we convert the String into bytes.
            byte b[] = s.getBytes();// converting string into byte array


            fout.write(b); //Writes the byte array into testout.txt.
            fout.close(); //Closes the file after writing.

            System.out.println("success..");

        }
        catch(Exception e){ //If something goes wrong, the error is printed.
            System.out.println(e);

        }
    }
}
