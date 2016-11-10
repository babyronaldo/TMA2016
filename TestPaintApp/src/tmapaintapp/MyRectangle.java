package tmapaintapp;

import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape
{
	public int width;
	public int height;

	public MyRectangle()
	{
		super();
	}

	public MyRectangle(int x1, int y1, boolean graphic2d, int width, int height)
	{
		super(x1, y1, graphic2d);
		this.width = width;
		this.height = height;
	}

	@Override
	void draw(Graphics g)
	{
		// TODO Auto-generated method stub
		if (getGraphic2())
			g.drawRect(x1, y1, width, height);
		else
			g.draw3DRect(x1, y1, width, height, getGraphic2());
	}
}
