class SavingAccount extends Account {
    protected double minimumBalance;

    public SavingAccount(String accountNumber, double balance, String accountHolderName, double minimumBalance) {
        super(accountNumber, balance, accountHolderName);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
}