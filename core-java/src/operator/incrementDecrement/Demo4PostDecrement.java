package operator.incrementDecrement;

public class Demo4PostDecrement {
    public static void main(String[] args) {

        int a = 5;
        int b = a--;//b=5, a=4
        // first it will do assignment operation and then will do decrement operation
        System.out.println(a);//4
        System.out.println(b);//5


    }
}
