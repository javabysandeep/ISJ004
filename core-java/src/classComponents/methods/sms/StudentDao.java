package classComponents.methods.sms;

public class StudentDao {
    void addStudent(Student student){
        System.out.println("Student Dao data received ");
        System.out.println("Student ID "+student.studentId);
        System.out.println("Student Name "+student.studentName);
        System.out.println("Student Address "+student.address);
    }
}
