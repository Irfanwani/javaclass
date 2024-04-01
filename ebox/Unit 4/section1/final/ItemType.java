public class ItemType {
	private String name;
	private Double costPerDay;
	private Double deposit;
	public ItemType(){}
	public ItemType(String name, Double costPerDay, Double deposit) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
		this.deposit = deposit;
	}
	public String getName() {
		//Fill your code here
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCostPerDay() {
		//Fill your code here
		return this.costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public Double getDeposit() {
		//Fill your code here
		return this.deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
}