package ObjectClassDemos;

import java.lang.reflect.Method;

public class Demo2 {

    public static void main(String[] args) {
        class Student {
            void m1() {
            }

            void m2() {
            }

            void m3() {
            }
        }
        Student student = new Student();
        Class<? extends Student> studentClass = student.getClass();
        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }
}
