package ObjectClassDemos;

public class Demo8Finalize {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize method overridden");
            }
        }

        Student s1 = new Student(1, "Vaibhav");
        s1 = null;
        System.gc();


    }
}
