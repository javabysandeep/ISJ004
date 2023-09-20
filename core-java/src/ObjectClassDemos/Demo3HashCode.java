package ObjectClassDemos;

public class Demo3HashCode {
    public static void main(String[] args) {
        class Student {
        }
        Student s1 = new Student();
        Student s2 = s1;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
