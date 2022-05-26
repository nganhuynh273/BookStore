package hpn.model;


import java.util.Date;

public class Bill extends DetailBill {
    private String idBill;
    private Customer customer;
    private Date createAt;
    private boolean rentalStatus;

    public String getIdBill() {

        return idBill;
    }

    public void setIdBill(String idBill) {

        this.idBill = idBill;
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    public Date getCreateAt() {

        return createAt;
    }

    public void setCreateAt(Date createAt) {

        this.createAt = createAt;
    }

    public Bill (Book book, int borrowedDay, int quantity) {
        super(book, borrowedDay, quantity);
    }

    public Bill (Book book, int borrowedDay, int quantity, String idBill, Customer customer, Date createAt) {
        super(book, borrowedDay, quantity);
        this.idBill = idBill;
        this.customer = customer;
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return idBill + ","
                + customer + ","
                + createAt + ","
                + super.toString();
    }
}
