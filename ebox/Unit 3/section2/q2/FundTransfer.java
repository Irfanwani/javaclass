abstract class FundTransfer {
    private String accountNumber;
    public Double balance;

    public FundTransfer(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public Double getBalance(){
        return balance;
    }
    public abstract Boolean transfer(Double transfer);

    public Boolean validate(Double transfer) {
        if (accountNumber.length() == 10) {
            if (transfer >= 0 && transfer <= balance) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}