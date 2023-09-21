package ObjectClassDemos;

public class Demo6ToString {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Student s1 = new Student(1, "vaibhav");
        System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));//integer value
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
