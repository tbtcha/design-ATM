package Transaction;

import enums.TransactionStatus;
import java.util.Date;

public class Withdraw extends Transaction {
    private double amount;

    public Withdraw(int transactionId, TransactionStatus status, Date creationDate, double amount) {
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
