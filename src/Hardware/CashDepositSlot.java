package Hardware;

public class CashDepositSlot extends DepositSlot{
    public CashDepositSlot(double totalAmount) {
        super(totalAmount);
    }

    public boolean receiveDollarBill(){
        return true;
    }
}
