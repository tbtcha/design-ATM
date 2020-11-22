package bankSystem;

public class CheckingAccount extends Account{
    private String debitCardNumber;

    public CheckingAccount(int accountNumber, double totalBalance, double availableBalance, String debitCardNumber) {
        super(accountNumber, totalBalance, availableBalance);
        this.debitCardNumber = debitCardNumber;
    }

    public String getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }
}
