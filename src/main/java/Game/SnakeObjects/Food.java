package Game.SnakeObjects;

import Game.util.ImageUtil;

import java.awt.Graphics;
import java.util.Random;

import static Game.MVC.View.HEIGHT;
import static Game.MVC.View.WIDTH;

/**
 * This class is responsible for the required methods for the food items that
 * the snake aims to eat in the game.
 * @author Thomas Neal - modified
 */
public class Food extends SnakeObject
{

	/**
	 * This method is a getter for the integer value representing the multiplier
	 * that will multiply the user's score when they play the game.
	 * @return
	 * This method returns the integer value of the multiplier.
	 */
	public int getMultiplier() { return this.m_scoreMultiplier; }

	/**
	 * This method is a setter for the integer value representing the multiplier
	 * that will multiply the user's score when they play the game.
	 * @param multiplier
	 * this parameter takes in the multiplier's integer value.
	 */
	public void setMultiplier(Integer multiplier) {
		this.m_scoreMultiplier = multiplier;
	}

	/**
	 * this variable contains the integer multiplier that will be used to
	 * multiply the score by whatever integer is contained within this variable.
	 */
	private Integer m_scoreMultiplier;

	/**
	 * This is the constructor, it takes in the ImageUtil object to set the
	 * food's graphics.
	 * @param imgUtil
	 * this variable is a container for the ImageUtil object which is used
	 * to get the images needed for the game.
	 */
	public Food(ImageUtil imgUtil, Integer multiplier)	{
		Random random = new Random();
		setL(true);
		setI(imgUtil.getImages().get(String.valueOf
				(new Random().nextInt(10))));
		setW(getI().getWidth(null));
		setH(getI().getHeight(null));
		setX(random.nextInt(WIDTH-50));
		setY(random.nextInt(HEIGHT-50));
		setMultiplier(multiplier);

	}

	/**
	 * This method checks if the snake has intersected with food and if it has
	 * the score is incremented by 1.
	 */
	public void eaten(Snake mySnake){

		if (mySnake.getRectangle().intersects
				(this.getRectangle()) && isL() && mySnake.isL()){
			setL(false);
			mySnake.changeLength(mySnake.getLength() + 1);
			mySnake.increaseScore(getMultiplier());
		}
	}

	/**
	 * This method updates the GUI when called and sets where the .png needs
	 * to be placed on the window.
	 * @param g
	 * the <code>Graphics</code> context in which to paint
	 */
	@Override
	public void draw(Graphics g) {
		g.drawImage(getI(), getX(), getY(), null);
	}
}
