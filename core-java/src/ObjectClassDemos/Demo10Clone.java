package ObjectClassDemos;

public class Demo10Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Student implements Cloneable {
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
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Student s1 = new Student(1, "Vaibhav");

        //cloning process
        Student s2 = (Student) s1.clone(); // new object is  created.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);


    }
}
