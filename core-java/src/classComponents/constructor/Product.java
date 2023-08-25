package classComponents.constructor;

public class Product {
    int productId;
    String productName;
    int productPrice;

    public Product() {
    }

    public Product(int pId, String pName, int pPrice) {
        productId = pId;
        productName = pName;
        productPrice = pPrice;
    }

    public static void main(String[] args) {
        Product product1 = new Product();//
        Product product2 = new Product(101, "Laptop", 89999);//
    }
}
