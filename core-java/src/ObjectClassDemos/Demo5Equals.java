package ObjectClassDemos;

public class Demo5Equals {
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

        Student s2 = new Student(1, "vaibhav");
        System.out.println(s1 == s2);//false
        int a = 20;
        int b = 30;
        System.out.println(a == b);//false

        // == operator can be used with primitives as well as non-primitives.
        System.out.println(s1.equals(s2));//false

        System.out.println(s1.equals(s1));//true--> reflexive

        // symmetric --> a == b --> b==a

        //transitive --> a==b --> b==c --> a==c




    }
}
