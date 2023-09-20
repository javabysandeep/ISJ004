package ObjectClassDemos;

public class Demo1 {
    int instanceVariable =100;
    Demo1(){
        super();
    }
    public static void main(String[] args) {

        Demo1 d = new Demo1();
        Class<? extends Demo1> reference = d.getClass();
        System.out.println(reference.getName());
        System.out.println(reference.getMethods()[0].getName());
    }
}
