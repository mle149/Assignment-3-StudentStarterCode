import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		// TODO
		this.x = x;
	}
	public void setY(int y) { 
		// TODO
		this.y = y;
	}
	public void setWidth(int width) { 
		// TODO
		this.width = width;
	}
	public void setHeight(int height) { 
		// TODO
		this.height = height;
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;	// TODO: Return correct value
	}
	public int getY() { 
		return y;	// TODO: Return correct value
	}
	public int getWidth() { 
		return width;	// TODO: Return correct value
	}
	public int getHeight() { 
		return height;	// TODO: Return correct value
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
