package oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        //accessing the static variable
        System.out.println(Student.collegeName);

        //creation of object
        Student student = new Student();// object
        //student : reference variable
        //new Student(); object
        //Student : Type of data  : Class Name
        //new : it is a keyword which is used to create an object
        //Student() : constructor call

        //accessing the instance variable
        System.out.println(student.name);
        System.out.println(student.rollNumber);
        student = null;
    }
}
