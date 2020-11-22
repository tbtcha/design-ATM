package Transaction;

import java.util.Date;
import enums.TransactionStatus;

public class Transaction {
    private int transactionId;
    private TransactionStatus status;
    private Date creationDate;

    public Transaction(int transactionId, TransactionStatus status, Date creationDate) {
        this.transactionId = transactionId;
        this.status = status;
        this.creationDate = creationDate;
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

    public boolean saveTransaction(){
        if (status == TransactionStatus.Success){
            return true;
        }
        else return false;
    }
}
