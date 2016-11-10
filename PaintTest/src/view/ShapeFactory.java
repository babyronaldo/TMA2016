package view;

//import Rectangle;

public class ShapeFactory {
	public static Shape getShape(String shapeType){
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else{
			return null;
		}
	}
}