package exceptionHandling;

public class Demo10Finally {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
        //try-finally - rest of the code
    }
}
