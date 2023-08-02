package operator.incrementDecrement;

public class Demo2PostIncrement {
    public static void main(String[] args) {

        int a = 5;
        int b = a++;//b=5, a=6
        // first it will do assignment operation and then will do increment operation
        System.out.println(a);//6
        System.out.println(b);//5


    }
}
