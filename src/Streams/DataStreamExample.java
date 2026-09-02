package Streams;

import java.io.FileInputStream;

public class DataStreamExample {

    // Reading single character from a File.

    public static void main(String args[]) {

        try {

            // Open the file for reading
            FileInputStream fin =
                    new FileInputStream("D:\\Java\\Java-Basics\\src\\Streams\\dataStream.txt");

            // Read one byte from the file
            int i = fin.read(); //reads only the first character:

            // Convert the byte into a character and print it
            System.out.println((char) i);

            // Close the file
            fin.close();

        } catch (Exception e) {

            // Print the error if something goes wrong
            System.out.println(e);
        }
    }
}