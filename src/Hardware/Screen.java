package Hardware;

import enums.TransactionType;

public class Screen {
    public boolean showMessage(){
        return true;
    }
    public TransactionType getInput(String s){
        if (s == "BalanceInquiry") {
            return TransactionType.BalanceInquiry;
        }
        else if(s == "DepositCash"){
            return TransactionType.DepositCash;
        }
        else if(s == "DepositCheck"){
            return TransactionType.DepositCheck;
        }
        else if(s == "Withdraw"){
            return TransactionType.Withdraw;
        }
        else return TransactionType.Transfer;
    }
}
