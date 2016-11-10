package tmapaintapp;

import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape
{
	private boolean graphic2d; // boolean variable that determines 2d or 3d

	public MyBoundedShape()
	{
		super();
		graphic2d = false;
	}

	public MyBoundedShape(int x1, int y1, boolean graphic2d)
	{
		super(x1, y1);
		this.graphic2d = graphic2d;
	}

	public void setGraphic(boolean graphic2d)
	{
		this.graphic2d = graphic2d;
	}

	public boolean getGraphic2()
	{
		return graphic2d;
	}

	abstract void draw(Graphics g);
}
