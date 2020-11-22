package Transaction;

import enums.TransactionStatus;
import java.util.Date;

public class CashDeposit extends Deposit{
    private double cashDepositLimit;

    public CashDeposit(int transactionId, TransactionStatus status, Date creationDate, double amount, double cashDepositLimit) {
        super(transactionId, status, creationDate, amount);
        this.cashDepositLimit = cashDepositLimit;
    }

    public double getCashDepositLimit() {
        return cashDepositLimit;
    }

    public void setCashDepositLimit(double cashDepositLimit) {
        this.cashDepositLimit = cashDepositLimit;
    }
}
