package Streams;

import java.io.FileOutputStream;

public class OutputStream {

    public static void main(String[] args) {

        try {
            // Create a new file called hello.txt
            FileOutputStream fout =
                    new FileOutputStream("D:\\Java\\Java-Basics\\src\\Streams\\hello.txt");

            // Write ASCII value 65 into the file
            fout.write(65);

            // Close the file
            fout.close();

            System.out.println("success...");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}