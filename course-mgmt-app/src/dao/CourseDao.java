package dao;

import model.Course;

public class CourseDao {
    public void addCourse(Course course) {
        System.out.println("course added in the DB using Course Dao : addCourse");
        System.out.println(course.courseId + "\t" + course.courseName + "\t" + course.courseDescription + "\t" + course.coursePrice);
    }
}
