package bankSystem;

public class Account {
    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public Account(int accountNumber, double totalBalance, double availableBalance) {
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }

    public Account() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public int getAvailableBalance() {
        int value = (int) availableBalance;
        return value;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
