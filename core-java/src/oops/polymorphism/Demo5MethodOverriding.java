package oops.polymorphism;

public class Demo5MethodOverriding {
    public static void main(String[] args) {
        class Parent {
            int add(int number1, int number2) {
                return number1 + number2;
            }
        }

        class Child extends Parent {
            @Override
            int add(int number1, int number2) {
                System.out.println("child method");
                return number1 + number2;
            }
        }

        Child child = new Child();
        System.out.println(child.add(10,20));

    }
}
