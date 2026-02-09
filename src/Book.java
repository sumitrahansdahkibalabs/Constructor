public class Book {
    String bookTitle;
    String bookAuthor;
    double bookPrice;
    public Book (String bookTitle, String bookAuthor, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    void displayDetails() {
        System.out.println("Book Title: " +bookTitle);
        System.out.println("Author: " +bookAuthor);
        System.out.println("Price: $" +bookPrice);
    }
}
