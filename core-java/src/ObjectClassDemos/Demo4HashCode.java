package ObjectClassDemos;

public class Demo4HashCode {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = str1.intern();
        //   String str2 = "abc";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
