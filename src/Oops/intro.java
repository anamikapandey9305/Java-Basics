package Oops;

import java.util.Arrays;

class Student {
    int rno;
    String name;
    float marks;
}

public class intro {
    public static void main(String[] args) {

        // array of Student objects
        Student[] students = new Student[5];

        // creating one student object
        Student anamika = new Student();
        anamika.rno = 1;
        anamika.name = "Anamika";
        anamika.marks = 95.5f;

        System.out.println(anamika.rno);
        System.out.println(anamika.name);
        System.out.println(anamika.marks);

        students[0] = anamika;

    }

}

// // what is Class?
//
//        // Class : class is a named grouped of properties and functions
// It acts as a blueprint or template for creating objects.
//
//        // what is object ?
//
//        //Object is an instance of a class
//        // Object -> physical reality , occupying space in  the memory
//
//
//
