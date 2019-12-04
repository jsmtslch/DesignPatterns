package creational.factory;

public class VegPizza implements Pizza{

	@Override
	public void addToppings() {
		System.out.println("Adding veggies");
	}

}
