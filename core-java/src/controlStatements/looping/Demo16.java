package controlStatements.looping;

public class Demo16 {
    public static void main(String[] args) {

        for (int left = 0, right = 100; left < right; left++, right--) {
            System.out.println(left + "\t" + right);
        }
        // 0 100
        // 1 99
        // . ..
        //49 51
    }
}
