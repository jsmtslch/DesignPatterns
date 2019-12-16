package creational.prototype;

public class Accord extends Car{
	
	public Accord(int doors, String color, int hp) {
		super(doors, color, hp);
	}

	@Override
	public Car clone() {
		return new Accord(doors, color, hp);
	}

}
