package simplepaint;

//Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
public class ShapeFactory extends AbstractFactory
{

	@Override
	Graphic getGraphic(String graphic)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType)
	{
		// TODO Auto-generated method stub
		if (shapeType == null)
		{
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}

		else if (shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		return null;
	}
}
