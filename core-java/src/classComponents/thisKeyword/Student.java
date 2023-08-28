package classComponents.thisKeyword;

public class Student {
    int id;
    String name;

    public boolean equals(Student student) {
        return this.id == student.id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void getStudentDetails() {
        System.out.println("Student : " + this.id + "\t" + this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "abc");
        Student s2 = new Student(2, "xyz");

        s1.getStudentDetails();
        s2.getStudentDetails();

        System.out.println(s1.equals(s2));
    }

}
