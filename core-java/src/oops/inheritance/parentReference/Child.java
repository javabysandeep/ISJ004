package oops.inheritance.parentReference;

public class Child extends Parent {

    int iv = 200;

    void instanceMethod() {
        System.out.println("instance method : Child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println("Instance variable :"+parent.iv);
        parent.instanceMethod();
    }
}

