package Transactions;

import enums.TransactionStatus;
import java.util.Date;

public class Deposit extends Transaction {
    private double amount;

    public Deposit(int transactionId, TransactionStatus status, Date creationDate, double amount) {
        super(transactionId, status, creationDate);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
