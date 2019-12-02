package structural.decorator;

public class HouseBlend extends Beverage{
	private String name;
	private double cost;
	
	public HouseBlend() {
		this.name = "House Blend";
		this.cost = 1.99;
	}
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public double getCost() {
		return this.cost;
	}
}
