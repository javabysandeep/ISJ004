package oops.polymorphism;

public class Demo2MethodOverloading {
    public static void main(String[] args) {
        class Parent {
            int add(int number1, int number2) {
                return number1 + number2;
            }
        }

        class Child extends Parent {
            //method overloading
            double add(double number1, double number2) {
                return number1 + number2;
            }
        }
        Child child = new Child();
        System.out.println(child.add(10, 20));
        System.out.println(child.add(100.0f, 200.4f));
    }
}
