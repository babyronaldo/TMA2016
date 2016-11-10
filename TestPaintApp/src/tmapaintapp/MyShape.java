package tmapaintapp;

import java.awt.Graphics;

public abstract class MyShape
{
	protected int x1, y1;

	public MyShape()
	{
		x1 = 0;
		y1 = 0;
	}

	public MyShape(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getX1()
	{
		return x1;
	}

	public void setX1(int x1)
	{
		this.x1 = x1;
	}

	public int getY1()
	{
		return y1;
	}

	public void setY1(int y1)
	{
		this.y1 = y1;
	}

	abstract void draw(Graphics g);
}
