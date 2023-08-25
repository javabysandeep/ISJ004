package classComponents.constructor;

public class Student {
    int id;
    String name;
    String address;

    public Student() {
        System.out.println("zero param con");
    }

    public Student(int studentId, String studentName, String studentAddress) {
        //assign local variable valus to instance variables.
        id = studentId;
        name = studentName;
        address = studentAddress;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(1, "Virat ", "Swargate");
        System.out.println(student1.id + "\t" + student1.name + "\t" + student1.address);
        System.out.println(student2.id + "\t" + student2.name + "\t" + student2.address);
    }
}
