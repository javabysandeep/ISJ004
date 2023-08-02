package operator.incrementDecrement;

public class Demo1PreIncrement {
    public static void main(String[] args) {
        //++, --
        //System.out.println(10++);//++, -- is applicable for variable
        int a = 5;
        int b = ++a;// a will be increment by 1 and incremented value of a will be assigned to b
        // first it will do increment operation and then will do assignment operation
        System.out.println(a);//6
        System.out.println(b);//6


    }
}
