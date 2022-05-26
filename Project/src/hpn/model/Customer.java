package hpn.model;

import java.util.Date;

public class Customer extends Information {
    private String idCustomer;
    private Date expiryDate;

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Customer(String idCard, String name, boolean gender, String phone, String address, Date birthday) {
        super(idCard, name, gender, phone, address, birthday);
    }

    public Customer(String idCard, String name, boolean gender, String phone, String address, Date birthday, String idCustomer, Date expiryDate) {
        super(idCard, name, gender, phone, address, birthday);
        this.idCustomer = idCustomer;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return idCustomer + ","
                + expiryDate
                + super.toString();
    }
}
