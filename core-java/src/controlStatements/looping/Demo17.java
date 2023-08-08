package controlStatements.looping;

public class Demo17 {
    public static void main(String[] args) {
        // 10 = 1,2,5
        //6 = 1,2,3
        //28= 1,2,4,7,14
        //100 = 1,2,4,5,10,20,25,50
        int number = 6;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("its a factor " + i);
            }
        }
    }
}
