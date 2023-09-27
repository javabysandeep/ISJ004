package collectionFramework.customObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CourseApp2 {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        Course java = new Course(1, "Fullstack java", 499);
        Course python = new Course(11, "Fullstack python", 4999);
        Course dataScience = new Course(1, "Fullstack Data Science", 4990999);
        Course testing = new Course(20, "SOftware testing", 199);
        Course dotNet = new Course(101, "Fullstack .NET", 299);

        courseList.add(java);
        courseList.add(python);
        courseList.add(dataScience);
        courseList.add(testing);
        courseList.add(dotNet);

        System.out.println("Before sorting");
        courseList.forEach(System.out::println);

        Collections.sort(courseList, (c1,c2)->c1.getCourseName().compareTo(c2.getCourseName()));


        System.out.println("After sorting");
        courseList.forEach(System.out::println);
    }
}
