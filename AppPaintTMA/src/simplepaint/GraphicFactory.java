package simplepaint;

public class GraphicFactory extends AbstractFactory
{

	@Override
	Graphic getGraphic(String graphic)
	{
		// TODO Auto-generated method stub
		if (graphic == null)
		{
			return null;
		}
		if (graphic.equalsIgnoreCase("2D"))
		{
			return new Graphic2D();
		}
		if (graphic.equalsIgnoreCase("3D"))
		{
			return new Graphic3D();
		}
		return null;
	}

	@Override
	Shape getShape(String Shape)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
