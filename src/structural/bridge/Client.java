package structural.bridge;

public class Client {
	
	public static void main(String[] args) {
		Color red = new Red();
		Color green = new Green();
		Shape redRect = new Rectangle(red);
		redRect.applyColor();
		Shape greenRect = new Rectangle(green);
		greenRect.applyColor();
		Shape redTri = new Triangle(red);
		redTri.applyColor();
		Shape greenTri = new Triangle(green);
		greenTri.applyColor();
	}

}
