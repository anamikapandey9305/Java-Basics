package Streams;

import java.io.FileInputStream;

public class ReadAllCharcter {

    public static void main(String args[]) {

        try {

            // Open the file for reading
            FileInputStream fin =
                    new FileInputStream("D:\\Java\\Java-Basics\\src\\Streams\\Testin.txt");

            // Get the number of bytes available in the file
            int size = fin.available();

            // Read the file byte by byte
            for (int i = 0; i < size; i++) {

                // Convert each byte into a character and print it
                System.out.print((char) fin.read() + "");
            }

            // Close the file
            fin.close();

        } catch (Exception e) {

            // Print error if something goes wrong
            System.out.println(e);
        }
    }
}