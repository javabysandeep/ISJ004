package assignments.classObject;

public class Assignment3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 10.3f;
        triangle.side2 = 20.3f;
        triangle.side3 = 30.3f;

        System.out.println("Area of triangle " + triangle.getArea());
        System.out.println("Perimeter of triangle " + triangle.getPerimeter());
    }
}

class Triangle {
    float side1;
    float side2;
    float side3;

    float getArea() {
        return (float) (0.5 * (side1 * side2 ));
    }

    float getPerimeter() {
        return side1 + side2 + side3;
    }
}
/*
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle'
without any parameter in its constructor.*/
