package creational.prototype;

public abstract class Car {
	public int doors;
	public String color;
	public int hp;
	
	public Car(int doors, String color, int hp) {
		this.doors = doors;
		this.color = color;
		this.hp = hp;
	}
	
	public abstract Car clone();
}
