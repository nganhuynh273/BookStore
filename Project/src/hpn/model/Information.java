package hpn.model;

import java.util.Date;

public class Information {
    private String idCard;
    private String name;
    private boolean gender;
    private String phone;
    private String address;
    private Date birthday;

    public Information(String idCard, String name, boolean gender, String phone, String address, Date birthday) {
        this.idCard = idCard;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
    }

    public String getIdCard() {

        return idCard;
    }

    public void setIdCard(String idCard) {

        this.idCard = idCard;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isGender() {

        return gender;
    }

    public void setGender(boolean gender) {

        this.gender = gender;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public Date getBirthday() {

        return birthday;
    }

    public void setBirthday(Date birthday) {

        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return idCard + ","
                + name + ","
                + gender + ","
                + phone + ","
                + address + ","
                + birthday;
    }
}
