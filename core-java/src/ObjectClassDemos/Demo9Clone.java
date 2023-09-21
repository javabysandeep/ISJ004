package ObjectClassDemos;

public class Demo9Clone {
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
        }

        Student s1 = new Student(1, "Vaibhav");

        //reference copy
        Student s2 = s1; // new object is not created.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());



    }
}
