package classComponents.methods.sms;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    void addStudent(Student student){
        studentDao.addStudent(student);
    }
}
