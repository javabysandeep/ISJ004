package controlStatements.looping;

public class Demo15 {
    public static void main(String[] args) {
        int left = 0;
        int right = 100;
        for (; left < right; ) {
            System.out.println(left + "\t" + right);
            left++;
            right--;
        }
        // 0 100
        // 1 99
        // . ..
        //49 51
    }
}
