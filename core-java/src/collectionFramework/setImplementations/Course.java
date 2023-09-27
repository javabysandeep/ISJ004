package collectionFramework.setImplementations;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Course /*implements Comparable<Course>*/ {
    private int courseId;
    private String courseName;
    private int coursePrice;

  /*  @Override
    public int compareTo(Course course) {
        return this.coursePrice - course.coursePrice;
    }*/
}
