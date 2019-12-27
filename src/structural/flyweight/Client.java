package structural.flyweight;

import structural.flyweight.ShapeFactory.ShapeType;

public class Client {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape s1 = factory.getShape(ShapeType.CIRCLE_EMPTY);
		Shape s2 = factory.getShape(ShapeType.CIRCLE_FILL);
		Shape s3 = factory.getShape(ShapeType.RECT_EMPTY);
		Shape s4 = factory.getShape(ShapeType.RECT_FILL);
		
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}
}
