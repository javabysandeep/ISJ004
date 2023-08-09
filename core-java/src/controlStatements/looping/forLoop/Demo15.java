package controlStatements.looping.forLoop;

public class Demo15 {
    public static void main(String[] args) {
        // reverse the array content or string
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
