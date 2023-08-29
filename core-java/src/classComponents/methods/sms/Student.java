package classComponents.methods.sms;

public class Student {
    int studentId;
    String studentName;
    String address;

    public Student() {
    }

    public Student(int studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    //Copy constructor  or  Clone constructor
    public Student(Student student) {
        this.studentId = student.studentId;
        this.studentName = student.studentName;
        this.address = student.address;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Sachin","Pune");
        Student student2 = new Student(student1);
    }

}
