package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry {

	Map<String, Car> carRegistry = new HashMap<>();
	
	public CarRegistry() {
		Accord accordCoupe = new Accord(2, "black", 180);
		carRegistry.put("Accord Coupe", accordCoupe);
		Accord accorSedan = new Accord(4, "black", 180);
		carRegistry.put("Accord Sedan", accorSedan);
	}
	
	public Car getNewCar(String carSpec) {
		return carRegistry.get(carSpec).clone();
	}
}
