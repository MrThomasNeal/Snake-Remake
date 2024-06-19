package Game.SnakeObjects;

import Game.util.ImageUtil;

import java.awt.*;

/**
 * This class is responsible for the methods and logic needed for the obstacles
 * to correctly function in the game.
 * @author Thomas Neal
 */
public class Obstacle extends SnakeObject{

    /**
     * This constructor calls the correct setters from the parent class
     * "SnakeObject" for the obstacles to function.
     * @param imgUtil
     * this variable is a container for the ImageUtil object which is used to
     * get images, e.g. getting the "obstacle" image.
     * @param position
     */
    public Obstacle(ImageUtil imgUtil, Point position) {
        setL(true);
        setI(imgUtil.getImages().get("obstacle"));
        setW(getI().getWidth(null));
        setH(getI().getHeight(null));
        setX(position.x);
        setY(position.y);
    }

    /**
     * This method checks if the snake has hit the obstacle or not. If it has,
     * it sets mySnake.L as false.
     * @param mySnake
     * this variable is a container for the Snake object and this method takes
     * it as a parameter in order to use its getters and getRectangle() method.
     */
    public void hits(Snake mySnake){
        if (mySnake.getRectangle().intersects
                (this.getRectangle()) && isL() && mySnake.isL()){
            mySnake.setL(false);
        }
    }

    /**
     * This method draws the Graphics in the game window.
     * @param g
     * the <code>Graphics</code> context in which to paint
     */
    @Override
    public void draw(Graphics g) {
        g.drawImage(getI(), getX(), getY(), null);
    }
}
