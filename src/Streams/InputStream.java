package Streams;

import java.io.FileInputStream;

public class InputStream {

    public static void main(String[] args) throws Exception {

        // Open the test.txt file for reading
        FileInputStream input =
                new FileInputStream("D:\\Java\\Java-Basics\\src\\Streams\\test.txt");

        // Variable to store the data read from the file
        int data;

        // Read the file one byte at a time
        // read() returns -1 when the end of the file is reached
        while ((data = input.read()) != -1) {

            // Convert the byte into a character and print it
            System.out.print((char) data);
        }

        // Close the file after reading
        input.close();
    }
}