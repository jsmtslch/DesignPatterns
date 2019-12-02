package structural.decorator;

public class Whip extends Beverage{
	
	Beverage beverage;
	private String name;
	private double cost;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.name = beverage.getName() + " ,whip";
		this.cost = beverage.getCost() + 0.99;
	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
