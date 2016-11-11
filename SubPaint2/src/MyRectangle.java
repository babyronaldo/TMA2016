import java.awt.Color;
import java.awt.Graphics;

/**
 * This class inherits from MyBoundedShape and is responsible for drawing a rectangle
 */
public class MyRectangle extends MyBoundedShape
{ 
	private boolean fill;
    /**
     * No parameter constructor which calls the no parameter constructor in MyBoundedShape
     */
    public MyRectangle()
    {
        super();
    }
    
    /** 
     * Overloaded constructor that takes coordinates, color and fill. 
     * It passes them into MyBoundedShape's constructor
     */
    public MyRectangle( int x1, int y1, int x2, int y2, Color color, boolean fill )
    {
        super(x1, y1, x2, y2, color,fill);
       // this.raised=raise;
    } 
    
    
    /**
     * Overrides the draw method in MyBoundedShape. It sets the gets the color from MyBoundedShape
     * to set the color and the values it needs to draw from MyBoundedShape as well.
     */
    @Override
    public void draw( Graphics g )
    {
        g.setColor( getColor() ); //sets the color
        if (getFill()) //determines whether fill is true or false
            g.fillRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() ); //draws a filled rectangle
        else
            g.draw3DRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight(), fill ); //draws a 3D rectangle
        
    } 
    
}