class AccountBO {
    public FixedAccount getAccountDetail(String detail) {
        String[] details = detail.split(",");
        String accountNumber = details[0];
        double balance = Double.parseDouble(details[1]);
        String accountHolderName = details[2];
        double minimumBalance = Double.parseDouble(details[3]);
        int lockingPeriod = Integer.parseInt(details[4]);

        return new FixedAccount(accountNumber, balance, accountHolderName, minimumBalance, lockingPeriod);
    }
}