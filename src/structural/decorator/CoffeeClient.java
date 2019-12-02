package structural.decorator;

public class CoffeeClient {
	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();
		Beverage whip = new Whip(houseBlend);
		
		System.out.println("Here's your: "+whip.getName()+". and your total is: $"+whip.getCost());
	}
}
