package exceptionHandling;

public class Demo11Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
        //finally - ae
    }
}
