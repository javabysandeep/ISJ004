package classComponents.thisKeyword;

public class Product {
    int productId;
    String productName;
    int productPrice;

    public Product() {
        System.out.println("zero param or no args constructor");
    }

    /*public Product(int pId, String pName, int pPrice) {
        productId = pId;
        productName = pName;
        productPrice = pPrice;
    }*/
    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public static void main(String[] args) {
        Product product = new Product(101, "Mobile", 20000);
        System.out.println(product.productId + "\t" + product.productName + "\t" + product.productPrice);

        Product product2 = new Product(201, "Laptop", 200000);
        System.out.println(product2.productId + "\t" + product2.productName + "\t" + product2.productPrice);
    }
}
