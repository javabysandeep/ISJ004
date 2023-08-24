package controller;

import model.Course;
import service.CourseService;

public class CourseController {
    public void addCourse(Course course) {
        CourseService courseService = new CourseService();
        courseService.addCourse(course);
    }
}
