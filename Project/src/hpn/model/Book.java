package hpn.model;

public class Book {
    private long bookID;
    private String nameBook;
    private String genre;
    private String status;
    private String publisher;
    private String note;
    private double price;
    private int quantityStock;

    public Book(long bookID, String nameBook, String genre, String status, String publisher, String note, double price, int quantity) {
        this.bookID = bookID;
        this.nameBook = nameBook;
        this.genre = genre;
        this.status = status;
        this.publisher = publisher;
        this.note = note;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantity) {
        this.quantityStock = quantityStock;
    }

    @Override
    public String toString() {
        return bookID + ","
                + nameBook + "'"
                + genre + ","
                + status + ","
                + publisher + ","
                + note + ","
                + price + ","
                + quantityStock;
    }
}
