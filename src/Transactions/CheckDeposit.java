package Transactions;

import enums.TransactionStatus;
import java.util.Date;

public class CheckDeposit extends Deposit{
    private String checkNumber;
    private String bankCode;

    public CheckDeposit(int transactionId, TransactionStatus status, Date creationDate, double amount, String checkNumber, String bankCode) {
        super(transactionId, status, creationDate, amount);
        this.checkNumber = checkNumber;
        this.bankCode = bankCode;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
