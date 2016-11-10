package simplepaint;

//Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing an information such as type
public class AbstractFactoryPatternDemo
{
	public static void main(String[] args)
	{
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Shape Circle
		shape1.draw();

		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Shape Rectangle
		shape2.draw();

		// get color factory
		AbstractFactory graphicFactory = FactoryProducer.getFactory("GRAPHIC");

		// get an object of Color Red
		Graphic graphic2d = graphicFactory.getGraphic("2D");

		// call fill method of Red
		graphic2d.graphic();
		// get an object of Color Green
		Graphic graphic3d = graphicFactory.getGraphic("3D");

		// call fill method of Green
		graphic3d.graphic();

	}
}
