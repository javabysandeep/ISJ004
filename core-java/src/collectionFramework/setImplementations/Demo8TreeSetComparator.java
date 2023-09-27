package collectionFramework.setImplementations;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo8TreeSetComparator {
    public static void main(String[] args) {
//        Comparator<Course> comparator = (c1, c2) -> c1.getCourseId() - c2.getCourseId();
//        Comparator<Course> comparator = Comparator.comparingInt(Course::getCoursePrice);
        Comparator<Course> comparator = Comparator.comparing(Course::getCourseName);
        Set<Course> courseSet = new TreeSet<>(comparator);

        Course java = new Course(1, "Fullstack java", 499);
        Course java2 = new Course(1, "Fullstack java", 699);
        Course java3 = new Course(1, "Fullstack java", 799);
        Course python = new Course(11, "Fullstack python", 4999);
        Course dataScience = new Course(1, "Fullstack Data Science", 4990999);
        Course testing = new Course(20, "SOftware testing", 199);
        Course dotNet = new Course(101, "Fullstack .NET", 299);

        courseSet.add(java);
        courseSet.add(java2);
        courseSet.add(java3);
        courseSet.add(python);
        courseSet.add(dataScience);
        courseSet.add(testing);
        courseSet.add(dotNet);

        courseSet.forEach(System.out::println);
    }
}
