package creational.prototype;

public class Civic extends Car {

	public Civic(int doors, String color, int hp) {
		super(doors, color, hp);
	}

	@Override
	public Car clone() {
		return new Civic(doors, color, hp);
	}

}
