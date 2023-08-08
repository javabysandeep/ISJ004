package controlStatements.looping;

public class Demo14 {
    public static void main(String[] args) {
        int left = 0;
        int right = 100;
        for (; left < right; ) {
            System.out.println(left + "\t" + right);
        }
        //infinite 0 100
    }
}
