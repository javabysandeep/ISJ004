package oops.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Product product = new Product();
        // product.id = -91;

        product.setId(-91);
        System.out.println(product.getId());
    }
}
