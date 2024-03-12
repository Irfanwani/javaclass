public class NEFTTransfer extends FundTransfer {

    public NEFTTransfer(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    public Boolean transfer(Double transfer) {
        double service = transfer * 0.05;
        double totalAmount = service + transfer;

        if (totalAmount < super.balance) {
            super.balance = super.balance - totalAmount;
            return true;
        } else {
            return false;
        }
    }
}