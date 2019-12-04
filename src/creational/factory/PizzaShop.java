package creational.factory;

public class PizzaShop {
	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		Pizza pizza = factory.createPizza("cheese");
		pizza.addToppings();
		
		Pizza pizzaChicago = factory.createPizza("veg");
		pizzaChicago.addToppings();
	}
}
