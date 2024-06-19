package Game.SnakeObjects;

import java.awt.*;

/**
 * This class is responsible for holding the data of objects created whose
 * class extends SnakeObject such as Snake and Food.
 * @author Thomas Neal
 */
public abstract class SnakeObject {

    /**
     * This method is a getter for the integer variable H, representing the
     * object's height.
     * @return
     * This method returns the height of the object.
     */
    public int getH() {
        return h;
    }

    /**
     * This method is a getter for the integer variable X, which represents
     * the x coordinate of the object.
     * @return
     * This method returns the integer variable X, which represents the x
     * coordinate of the object.
     */
    public int getX() {
        return x;
    }

    /**
     * This method is a getter for the integer variable W, which represents the
     * width of the object.
     * @return
     * This method returns the width of the object.
     */
    public int getW() {
        return w;
    }

    /**
     * This method is the getter for the variable I, of type Image. Image
     * represents what the object looks like.
     * @return
     * This method returns the image of the object.
     */
    public Image getI() { return i; }

    /**
     * This method is a getter for the integer variable Y, which represents
     * the Y coordinates of the object on the game.
     * @return
     * This method returns the Y coordinate of the object.
     */
    public int getY() { return y; }

    /**
     * This method is a getter for a Rectangle object.
     * @return
     * This method returns a new Rectangle with size and location based
     * on the objects variable values.
     */
    public Rectangle getRectangle()
    {
        return new Rectangle(x, y, w, h);
    }

    /**
     * This method is a getter for the boolean variable L, which when false
     * represents the snake as "dead" and the game is failed.
     * @return
     * This method returns true if the snake has died, false if the snake is
     * still alive.
     */
    public boolean isL() {
        return l;
    }

    /**
     * This method is the setter for the integer variable H, representing the
     * object's height.
     * @param h
     * this variable is the new value that the height is to be set to.
     */
    public void setH(int h) {
        this.h = h;
    }


    /**
     * This method is a setter for the boolean variable L, which when false
     * represents the snake as "dead" and the game is failed.
     * @param l
     * this variable will hold true or false, and will set this.l to the value
     * passed into the method via this parameter.
     */
    public void setL(boolean l) {
        this.l = l;
    }


    /**
     * This method is a setter for the integer variable X, which represents the
     * x coordinate of the object
     * @param x
     * this parameter takes in the new x coordinate of the object and sets
     * it in "this.x".
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * This method is a setter for the integer variable W, which represents the
     * width of the object.
     * @param w
     * the parameter takes in the width to set the object to and sets it in
     * "this.w".
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * This method is the setter for the image of the object.
     * @param i
     * this parameter takes in the image to set the object to look like.
     */
    public void setI(Image i) { this.i = i; }

    /**
     * This method is a setter for the integer variable Y, which represents
     * the Y coordinates of the object on the game.
     * @param y
     * this parameter takes in a y coordinate and sets the object's Y coordinate
     * in "this.y".
     */
    public void setY(int y) { this.y = y; }

    /**
     * this variable contains the x coordinate of the object.
     */
    int x;

    /**
     * this variable contains the y coordinate of the object.
     */
    int y;

    /**
     * this variable contains the image of the object.
     */
    private Image i;

    /**
     * this variable contains the width of the object.
     */
    int w;

    /**
     * this variable contains the height of the object.
     */
    int h;

    /**
     * this variable is set to true if the snake is alive, and false if it has
     * died by losing the game.
     */
    public boolean l;

    /**
     * This method is responsible for updating the GUI of the game.
     * @param g
     * the <code>Graphics</code> context in which to paint.
     */
    public abstract void draw(Graphics g) ;

}

