package hpn.model;

public class User {
    private String accountName;
    private String pass;
    private int accounType;
    private String employeeCode;

    public User(String accountName, String pass, int accounType, String employeeCode) {
        this.accountName = accountName;
        this.pass = pass;
        this.accounType = accounType;
        this.employeeCode = employeeCode;
    }

    public String getAccountName() {

        return accountName;
    }

    public void setAccountName(String accountName) {

        this.accountName = accountName;
    }

    public String getPass() {

        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAccounType() {

        return accounType;
    }

    public void setAccounType(int accounType) {

        this.accounType = accounType;
    }

    public String getEmployeeCode() {

        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {

        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return accountName + ","
                + pass + ","
                + accounType + ","
                + employeeCode;
    }
}
