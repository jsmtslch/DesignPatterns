package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	private Map<ShapeType, Shape> shapeMap = new HashMap<>();
	
	public Shape getShape(ShapeType shapeType) {
		Shape shape = shapeMap.get(shapeType);
		if(shape == null) {
			if(shapeType.equals(ShapeType.CIRCLE_FILL)) {
				shape = new Circle(true);
			}if(shapeType.equals(ShapeType.CIRCLE_EMPTY)) {
				shape = new Circle(false);
			}if(shapeType.equals(ShapeType.RECT_FILL)) {
				shape = new Rectangle(true);
			}if(shapeType.equals(ShapeType.RECT_EMPTY)) {
				shape = new Rectangle(false);
			}
			shapeMap.put(shapeType, shape);
		}
		return shape;
	}
	
	public static enum ShapeType{
		CIRCLE_FILL, CIRCLE_EMPTY, RECT_FILL, RECT_EMPTY
	}

}
