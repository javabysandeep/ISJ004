package ObjectClassDemos;

import oops.encapsulation.Product;

import java.util.Objects;

public class Demo7 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Student)) return false;
                Student student = (Student) o;
                return id == student.id && name.equals(student.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, name);
            }
        }
        Student s1 = new Student(1, "vaibhav");
        Student s2 = new Student(1, "vaibhav");

        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(null));
        System.out.println(s1.equals(new Product()));
    }
}
