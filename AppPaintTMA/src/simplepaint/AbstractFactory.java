package simplepaint;

//abstract class to gets graphic and shape objects
public abstract class AbstractFactory
{
	abstract Graphic getGraphic(String graphic);

	abstract Shape getShape(String Shape);
}
