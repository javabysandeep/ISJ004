package classComponents.methods.assignment;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    void addCourse() {
        System.out.println("CourseService : addCourse Method");
        //call CourseDao : addCourse Method
        courseDao.addCourse();
    }

    void deleteCourse() {
        System.out.println("CourseService : deleteCourse Method");
        //call CourseDao : deleteCourse Method
        courseDao.deleteCourse();
    }

    void editCourse() {
        System.out.println("CourseService : editCourse Method");
        //call CourseDao : editCourse Method
        courseDao.editCourse();
    }
}
