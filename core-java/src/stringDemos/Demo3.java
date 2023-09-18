package stringDemos;

import classComponents.thisKeyword.Student;

public class Demo3 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("abc");
        String str4 = new String("abc");
        String str5 = "abc";
        String str6 = "abc";
        String str7 = "abc";

        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(str6));
        System.out.println(System.identityHashCode(str7));

        System.out.println(str1.toString());
        Student student = new Student(1,"");
        System.out.println(student.toString());

        //total objects created are 5 : inside the heap 4 and 1 in SCP
    }
}
