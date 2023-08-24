package app;

import controller.CourseController;
import model.Course;

public class CourseMgmtApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        Course course = new Course();
        course.courseId = 1;
        course.courseName ="Java";
        course.courseDescription ="Live class";
        course.coursePrice=99;

        courseController.addCourse(course);
    }
}
