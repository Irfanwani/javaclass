public class IMPSTransfer extends FundTransfer {

    public IMPSTransfer(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    public Boolean transfer(Double transfer) {
        double service = transfer * 0.02;
        double totalAmount = service + transfer;

        if (totalAmount < super.balance) {
            super.balance = super.balance - totalAmount;
            return true;
        } else {
            return false;
        }
    }
}