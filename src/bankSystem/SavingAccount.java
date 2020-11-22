package bankSystem;

public class SavingAccount extends Account{
    private double withdrawLimit;

    public SavingAccount(int accountNumber, double totalBalance, double availableBalance, double withdrawLimit) {
        super(accountNumber, totalBalance, availableBalance);
        this.withdrawLimit = withdrawLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
