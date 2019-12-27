package structural.flyweight;

public class Circle implements Shape {
	
	public Circle(boolean fill) {
		if(fill)
			System.out.println("Creating Circle with filling");
		else
			System.out.println("Creating circle without filling");
	}

	@Override
	public void draw() {
		System.out.println("Heavy lifting of circle drawing");
	}

}
