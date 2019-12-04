package creational.factory;

public class PizzaFactory {
	
	Pizza pizza = null;
	
	public Pizza createPizza(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("cheese")) {
			pizza = new CheesePizza();
		}if(pizzaType.equalsIgnoreCase("veg")) {
			pizza = new VegPizza();
		}
		return pizza;
	}

}
