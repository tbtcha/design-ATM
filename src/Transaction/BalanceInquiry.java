package Transaction;

import enums.TransactionStatus;
import java.util.Date;

public class BalanceInquiry extends Transaction{
    private double accountId;

    public BalanceInquiry(int transactionId, TransactionStatus status, Date creationDate, double accountId) {
        super(transactionId, status, creationDate);
        this.accountId = accountId;
    }

    public void setAccountId(double accountId) {
        this.accountId = accountId;
    }

    public double getAccountId() {
        return accountId;
    }

}
