public class Hall {
	private String name;
	private Double costPerDay;
	private String owner;
	public Hall(){}
	public Hall(String name, Double costPerDay, String owner) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
		this.owner = owner;
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
	public String getOwner() {
		//Fill your code here
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}