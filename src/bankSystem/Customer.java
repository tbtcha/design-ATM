package bankSystem;

import enums.CustomerStatus;
import enums.TransactionStatus;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;

    public Customer(String name, String email, String phone, Address address, CustomerStatus status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
    public boolean makeTransaction(){
        if(status == CustomerStatus.Active){
            return true;
        }
        else return false;
    }
}
