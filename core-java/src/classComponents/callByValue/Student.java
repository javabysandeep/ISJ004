package classComponents.callByValue;

public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "Amit";
        changeStudent(student);
        System.out.println(student.id + "\t" + student.name);//101, Amit
    }


    public static void changeStudent(Student student) {
        student = new Student();
        System.out.println(student.id + "\t" + student.name);//0 null
    }
}
