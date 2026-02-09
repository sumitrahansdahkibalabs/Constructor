public class Product {
    String productName;
    double productPrice;
    String productCategory;
    public Product (String productName, double productPrice, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }
    void displayDetails() {
        System.out.println("Product name: " +productName);
        System.out.println("Product Price: $" +productPrice);
        System.out.println("Product Category: " +productCategory);
    }
}
