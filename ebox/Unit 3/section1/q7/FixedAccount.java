class FixedAccount extends SavingAccount {
    private int lockingPeriod;

    public FixedAccount(String accountNumber, double balance, String accountHolderName, double minimumBalance, int lockingPeriod) {
        super(accountNumber, balance, accountHolderName, minimumBalance);
        this.lockingPeriod = lockingPeriod;
    }

    public int getLockingPeriod() {
        return lockingPeriod;
    }
}