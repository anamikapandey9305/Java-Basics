package Methods;

class Student {

    int age = 20;  // instance variable

    void showAge() {
        System.out.println(age);
    }
}

public class InstanceVariable {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.age);
        s.showAge();
    }
}