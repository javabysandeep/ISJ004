package assignments.classObject;

public class Assignment2 {
    public static void main(String[] args) {
        /*
        * 1. Create a class named 'Student' with String variable 'name' and integer variable 'rollNumber'.
            1. Assign the value of rollNumber as '2' and that of name as "John" by creating an object of the class Student.
         2. Assign and print the roll number, name of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
        * */
        Student john = new Student();
        john.rollNumber = 1;
        john.name = "John";

        System.out.println("John details : " + john.rollNumber + "\t" + john.name);

        Student sam = new Student();
        sam.rollNumber = 2;
        sam.name = "sam";
        System.out.println("Sam details : " + sam.rollNumber + "\t" + sam.name);
    }
}

class Student {
    int rollNumber;
    String name;
}
