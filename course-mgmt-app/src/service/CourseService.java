package service;

import dao.CourseDao;
import model.Course;

public class CourseService {
   public void addCourse(Course course){
       CourseDao courseDao = new CourseDao();
       courseDao.addCourse(course);
    }
}
