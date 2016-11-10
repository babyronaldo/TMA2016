//package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Circle extends JPanel implements Shape {

	private int x;
	private int y;
	private int radius;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.drawOval(x, y, radius, radius);
		graphics2d.setColor(Color.BLACK);
		graphics2d.fillOval(x, y, radius, radius);
		graphics2d.fillRect(x, y, radius, radius);
		repaint();
	}
}