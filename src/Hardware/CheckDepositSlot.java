package Hardware;

public class CheckDepositSlot extends DepositSlot{
    public CheckDepositSlot(double totalAmount) {
        super(totalAmount);
    }

    public double getCheckAmount(){
        return totalAmount;
    }
}
