public class Book {
    private String bookId;
    private String bookName;
    private double price;
    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Giá: " + price);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Book book1 = new Book("B001", "Harry Potter", 120000);
        Book book2 = new Book("B002", "Chí Phèo", 150000);
        book1.displayInfo();
        book2.displayInfo();
    }
}
