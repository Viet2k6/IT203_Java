public class Product {
    private String productId;
    private String productName;
    private double price;
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá phải lớn hơn 0.");
        }
    }

    public void displayInfo() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá bán: " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("SP01", "Laptop Gaming", 1000000);
        System.out.println("Thông tin sản phẩm ban đầu:");
        p1.displayInfo();
        System.out.println("\nThử set giá = -1:");
        p1.setPrice(-500);
        System.out.println("\nSau khi set giá:");
        p1.displayInfo();
    }
}
