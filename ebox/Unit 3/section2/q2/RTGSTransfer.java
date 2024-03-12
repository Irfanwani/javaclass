public class RTGSTransfer extends FundTransfer {
    public RTGSTransfer(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    public Boolean transfer(Double transfer) {
        if (transfer > 10000) {
            super.balance = super.balance - transfer;
            return true;
        } else {
            return false;
        }
    }
}