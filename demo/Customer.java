package StreamAPI.demo;

import java.sql.DataTruncation;
import java.util.Set;

public class Customer {
    private int customerID;
    private String customerName;
    private long   phoneNo;
    private String gender;
    private String address;

    public Customer() {
    }

    public Customer(int customerID, String customerName, long phoneNo, String gender, String address) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", phoneNo=" + phoneNo +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
