package Transactions;

import java.util.Date;

import bankSystem.ATM;
import bankSystem.Account;
import enums.TransactionStatus;

public class Transaction {
    private int transactionId;
    private TransactionStatus status;
    private Date creationDate = new Date();
    private ATM atm = new ATM();
    private Account account = new Account();

    public Transaction(int transactionId, TransactionStatus status, Date creationDate, ATM atm, Account account) {
        this.transactionId = transactionId;
        this.status = status;
        this.creationDate = creationDate;
        this.atm = atm;
        this.account = account;
    }

    public Transaction() {

    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean saveTransaction(){
        if (status == TransactionStatus.Success){
            return true;
        }
        else return false;
    }
}
