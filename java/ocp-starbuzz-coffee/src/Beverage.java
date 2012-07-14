
public abstract class Beverage {
	
	private final String description;
	
	public Beverage(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
    public abstract double getCost();
}