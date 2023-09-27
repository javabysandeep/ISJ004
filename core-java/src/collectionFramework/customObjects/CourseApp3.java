package collectionFramework.customObjects;

import java.util.*;

public class CourseApp3 {
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sort basis Course ID");
        System.out.println("2. Sort basis Course Name");
        System.out.println("3. Sort basis Course Price");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(courseList, Comparator.comparingInt(Course::getCourseId));
                courseList.forEach(System.out::println);
                break;
            case 2:
                Collections.sort(courseList, Comparator.comparing(Course::getCourseName));
                courseList.forEach(System.out::println);
                break;
            case 3:
                Collections.sort(courseList, Comparator.comparingInt(Course::getCoursePrice));
                courseList.forEach(System.out::println);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
