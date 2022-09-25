import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		// : Set width to Settings.BALL_WIDTH
		setWidth(Settings.BALL_WIDTH);
		// : Set height to Settings.BALL_HEIGHT
		setHeight(Settings.BALL_HEIGHT);
		// : Call resetPosition
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		// : Set the balls y by using the INITIAL_BALL_Y (see above)
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		x += xVelocity;
		// : Increase the y variable by yVelocity (see above)
		y += yVelocity;
		
		// Bounce off left side of screen
		if(x <= 0) {
			// : Set x to 0 so it does not leave the screen
			x = 0;
			// : Change the x velocity to make the ball go right
			setXVelocity(-(getXVelocity()));
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// : Set x to the right edge of the screen (see the above if condition)
			x = (Settings.WINDOW_WIDTH - Settings.BALL_WIDTH);
			// : Change the x velocity to make the ball go left
			setXVelocity(-(getXVelocity()));
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			// : Set y to 0 so it does not leave the screen
			y = 0;
			// : Change the y velocity to make the ball go downward
			setYVelocity(-(getYVelocity()));
		}
		
	}
	
	public void setXVelocity(int x) {
		// : Set the x velocity
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		// : Set the y velocity
		yVelocity = y;
	}
	
	public int getXVelocity() {
		return xVelocity;	// : Return the x velocity
	}
	public int getYVelocity() {
		return yVelocity;	// : Return the y velocity
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
