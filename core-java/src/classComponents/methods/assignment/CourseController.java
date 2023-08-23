package classComponents.methods.assignment;

public class CourseController {

    CourseService courseService = new CourseService();

    void addCourse() {
        System.out.println("CourseController : addCourse Method");
        //call CourseService : addCourse Method
        courseService.addCourse();
    }

    void deleteCourse() {
        System.out.println("CourseController : deleteCourse Method");
        //call CourseService : deleteCourse Method
        courseService.deleteCourse();
    }

    void editCourse() {
        System.out.println("CourseController : editCourse Method");
        //call CourseService : editCourse Method
        courseService.editCourse();
    }
}
