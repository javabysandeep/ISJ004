package classComponents.methods;

public class Course {
    int courseId;
    String courseName;
    int coursePrice;

    //getter :
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    //Setters :
    public void setCourseId(int courseId) {
        //assign local variable value to the instance variable
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public static void main(String[] args) {
        Course course = new Course();
        //course : reference variable
        // = : assignment operator
        // new Course() : this is an object
        //Course : class name , type of data
        int a = 100;
        course.setCourseId(10);
        course.setCourseName("Fullstack Java");
        course.setCoursePrice(5000);

        System.out.println("Course ID " + course.getCourseId());
        System.out.println("Course Name " + course.getCourseName());
        System.out.println("Course Price " + course.getCoursePrice());


    }
}
