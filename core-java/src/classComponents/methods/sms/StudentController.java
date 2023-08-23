package classComponents.methods.sms;

public class StudentController {
    StudentService studentService = new StudentService();
    void addStudent(Student student){
        studentService.addStudent(student);
    }
}
