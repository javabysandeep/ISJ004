package classComponents.callByValue;

public class Demo2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "Amit";
        changeStudent(student);
        System.out.println(student.id + "\t" + student.name);//101, Amit
    }


    public static void changeStudent(Student s1) {
        s1 = new Student();
        s1.id = 202;
        s1.name = "Pratik";

        System.out.println(s1.id + "\t" + s1.name);//202  Pratik
    }
}
