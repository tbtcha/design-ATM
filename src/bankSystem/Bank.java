package bankSystem;

public class Bank {
    private String name;
    private String bankCode;

    public Bank(String name, String bankCode) {
        this.name = name;
        this.bankCode = bankCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
