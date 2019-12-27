package structural.flyweight;

public class Rectangle implements Shape {
	
	public Rectangle(boolean fill) {
		if(fill)
			System.out.println("Creating Rectangle with filling");
		else
			System.out.println("Creating Rectangle without filling");
	}

	@Override
	public void draw() {
		System.out.println("Heavy lifting of rectangle drawing");
	}

}
