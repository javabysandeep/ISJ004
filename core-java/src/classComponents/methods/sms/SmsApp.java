package classComponents.methods.sms;

public class SmsApp {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        Student student = new Student();
        student.studentId = 101;
        student.studentName = "Sachin";
        student.address = "Pune";

        studentController.addStudent(student);
       // studentController.addStudent(101,"Sachin","Pune",.............);
    }
}
