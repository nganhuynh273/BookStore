package hpn.model;

public class DetailBill {
    private Book book;
    private int borrowedDay;
    private int quantity;
    private boolean status;

    public DetailBill(Book book, int borrowedDay, int quantity, boolean status) {
        this.book = book;
        this.borrowedDay = borrowedDay;
        this.quantity = quantity;
        this.status = status;
    }

    public DetailBill(Book book, int borrowedDay, int quantity) {
        this.book = book;
        this.borrowedDay = borrowedDay;
        this.quantity = quantity;
        this.status = false;
    }

    public Book getBook() {

        return book;
    }

    public void setBook(Book book) {

        this.book = book;
    }

    public int getBorrowedDay() {

        return borrowedDay;
    }

    public void setBorrowedDay(int borrowedDay) {

        this.borrowedDay = borrowedDay;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public boolean isStatus() {

        return status;
    }

    public void setStatus(boolean status) {

        this.status = status;
    }

    @Override
    public String toString() {
        return book + ","
                + borrowedDay + ","
                + quantity + ","
                + status;
    }
}