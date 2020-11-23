package bankSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String bankCode;
    private List<Account> accounts = new ArrayList<>();

    public Bank() {
    }
    public Bank(String name, String bankCode, List<Account> accounts) {
        this.name = name;
        this.bankCode = bankCode;
        this.accounts = accounts;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public boolean addATM(){
        return true;
    }
}
