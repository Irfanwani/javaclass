public class Hall {
	//fill you code here
	private String name;
	private Integer costPerDay;
	private String ownerName;

	public Hall() {};
	
	public Hall(String name, Integer costPerDay, String ownerName) {
		this.name = name;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return this.name;
	}

	public Integer getCostPerDay() {
		return this.costPerDay;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCostPerDay(Integer costPerDay) {
		this.costPerDay = costPerDay;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
