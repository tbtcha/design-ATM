package bankSystem;

import Transactions.Transaction;
import enums.CustomerStatus;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;
    private Card card = new Card();
    private Account account = new Account();
    private ATM atm = new ATM();
    private Transaction transaction = new Transaction();

    public Customer(String name, String email, String phone, Address address, CustomerStatus status, Card card, Account account, ATM atm, Transaction transaction) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.card = card;
        this.account = account;
        this.atm = atm;
        this.transaction = transaction;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public boolean makeTransaction(){
        if(status == CustomerStatus.Active){
            return true;
        }
        else return false;
    }
}
