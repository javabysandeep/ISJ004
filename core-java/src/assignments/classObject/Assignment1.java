package assignments.classObject;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length and breadth of a rectangle");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        Rectangle rectangle = new Rectangle();
        rectangle.setDimension(length, breadth);
        System.out.println("area of rectangle " + rectangle.getArea());
    }
}

class Rectangle {
    int length;
    int breadth;
    /*
    * 1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
    1. First method named as 'setDimension' takes length and breadth of rectangle as parameters and
    *   the second method named as '**getArea**' returns the area of the rectangle.
    2. Length and breadth of rectangle are entered through keyboard.
    * */

    void setDimension(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}