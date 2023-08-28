package classComponents.thisKeyword;

public class Demo1 {
    public void m1(){
        System.out.println("Instance method m1");
        //m2();
        this.m2();
    }

    public void m2(){
        System.out.println("Instance method m2");
    }

    public static void main(String[] args) {
        Demo1 ref = new Demo1();
        //this.m1(); //CTE
        ref.m1();

        Demo1 ref2 = new Demo1();
        ref2.m1();
    }
}
