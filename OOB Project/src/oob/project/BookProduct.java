package oob.project;

public class BookProduct extends product {

   private String author, publisher;

    public BookProduct() {
    }

    public BookProduct(String author, String publisher, int productId, String name, float price) {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
