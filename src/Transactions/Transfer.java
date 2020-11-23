package Transactions;

import enums.TransactionStatus;
import java.util.Date;

public class Transfer extends Transaction {
    private int destinationAccountNumber;
    private int sourceAccountNumber;
    private double amount;

    public Transfer(int transactionId, TransactionStatus status, Date creationDate, int destinationAccountNumber, int sourceAccountNumber, double amount) {
        super(transactionId, status, creationDate);
        this.destinationAccountNumber = destinationAccountNumber;
        this.sourceAccountNumber = sourceAccountNumber;
        this.amount = amount;
    }

    public int getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public void setDestinationAccountNumber(int destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    public int getSourceAccountNumber() {
        return sourceAccountNumber;
    }

    public void setSourceAccountNumber(int sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
