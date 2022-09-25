import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		// : Set x using the parameter
		this.x = x;
		// : Set y using the parameter
		this.y = y;
		// : Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
		width = Settings.BRICK_WIDTH;
		height = Settings.BRICK_HEIGHT;
	}

	public boolean isBroken() {
		return broken;	// : Return the correct variable
	}
	public void setBroken(boolean b) {
		// : Set the broken variable using the parameter given
		broken = b;
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
