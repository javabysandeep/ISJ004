package controlStatements.conditional.userInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //input: byte, short, int, long, float, double, char, boolean, String
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the byte type");
        byte byteValue = scanner.nextByte();

        System.out.println("Enter the short type");
        short shortValue = scanner.nextShort();

        System.out.println("Enter the int type");
        int intValue = scanner.nextInt();

        System.out.println("Enter the long type");
        long longValue = scanner.nextLong();

        System.out.println("Enter the float type");
        float floatValue = scanner.nextFloat();

        System.out.println("Enter the double type");
        double doubleValue = scanner.nextDouble();

        System.out.println("Enter the boolean type");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Enter the String type");
        String stringValue = scanner.next();//string

        System.out.println("Enter the Character type");
        char characterValue = scanner.next().charAt(0);//character

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);
        System.out.println(characterValue);
    }
}
