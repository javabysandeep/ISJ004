package operator.incrementDecrement;

public class Demo3PreDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = --a;  //a=4, b=4
        // first it will do decrement operation and then will do assignment operation
        System.out.println(a);//4
        System.out.println(b);//4


    }
}
