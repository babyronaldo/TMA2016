package tmapaintapp;

import java.awt.Graphics;

public class MyCircle extends MyBoundedShape
{
	private int radius;

	public MyCircle()
	{
		super();
	}

	public MyCircle(int x1, int y1, boolean graphic2d, int radius)
	{
		super(x1, y1, graphic2d);
		this.radius = radius;
	}

	public int halfWidth()
	{
		return x1 = x1 - (radius / 2);
	}

	public int halfHeight()
	{
		return y1 = y1 - (radius / 2);
	}

	@Override
	void draw(Graphics g)
	{
		// TODO Auto-generated method stub
		if (getGraphic2())
			g.drawOval(halfWidth(), halfHeight(), radius, radius);
		else
			g.fillOval(halfWidth(), halfHeight(), radius, radius);
	}
}
