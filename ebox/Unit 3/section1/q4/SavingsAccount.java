public class SavingsAccount extends Account {
    private String orgName;

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        super(accName, accNo, bankName);
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display() {
        super.display();
        System.out.println("Organisation Name:" + getOrgName());
    }
}
