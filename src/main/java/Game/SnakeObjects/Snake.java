package Game.SnakeObjects;

import Game.util.ImageUtil;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static Game.MVC.View.HEIGHT;
import static Game.MVC.View.WIDTH;

/**
 * This class is responsible for the logic/methods needed for the snake within
 * the game.
 * @author Thomas Neal - modified
 */
public class Snake extends SnakeObject
{
    /**
     * This method is a getter for the image of the snake's head.
     * @return
     * This method returns the image of the snake's head.
     */
    public BufferedImage getIMG_SNAKE_HEAD() { return m_IMG_SNAKE_HEAD; }

    /**
     * This method is a getter for the integer value representing the user's
     * score.
     * @return
     * This method returns the score value to its caller.
     */
    public Integer getScore() { return this.m_score; }

    /**
     * This method is a getter for the bodypoints variable.
     * @return
     * This method returns the list variable for body points.
     */
    private List<Point> getBodyPoints() {return m_bodyPoints;}

    /**
     * This method is a getter for the speed of the snake
     * @return
     * This method returns the speed of the snake as an int variable.
     */
    private int getSpeed() {return m_speed_XY;}

    /**
     * This method is a getter for the integer variable "num".
     * @return
     * This method returns the integer variable "num".
     */
    private int getNum() {return m_num;}

    /**
     * This method is a getter for the length of the snake.
     * @return
     * This method returns an integer value representing the length of the snake.
     */
    public int getLength() { return m_length; }

    /**
     * This method is a getter for the image of the new snake head.
     * @return
     * This method returns a variable which contains the image of the snake's
     * head.
     */
    public BufferedImage getNewImgSnakeHead() {return m_newImgSnakeHead;}

    /**
     * This method is a getter for the current snake head image.
     * @return
     * This method returns an image of the current snake head.
     */
    public BufferedImage getImgSnakeHead() { return m_IMG_SNAKE_HEAD; }

    /**
     * This method returns true or false depending on whether the snake's
     * current direction of travel is left or not.
     * @return
     * This method returns true or false
     */
    public boolean isLeft() { return left; }

    /**
     * This method returns true or false depending on whether the snake's
     * current direction of travel is right or not.
     * @return
     * This method returns true or false
     */
    public boolean isRight() { return right; }

    /**
     * This method returns true or false depending on whether the snake's
     * current direction of travel is up or not.
     * @return
     * This method returns true or false
     */
    public boolean isUp() { return up; }

    /**
     * This method returns true or false depending on whether the snake's
     * current direction of travel is down or not.
     * @return
     * This method returns true or false
     */
    public boolean isDown() { return down; }


    /**
     * This method is a setter for setting the snake's current direction of
     * travel as left.
     * @param left
     * this parameter is true if the snake's direction is to be set to left.
     */
    public void setLeft(boolean left) {this.left = left;}


    /**
     * This method is a setter for setting the snake's current direction of
     * travel as right.
     * @param right
     * this parameter is true if the snake's direction is to be set to right.
     */
    public void setRight(boolean right) { this.right = right; }

    /**
     * This method is a setter for setting the snake's current direction of
     * travel as up.
     * @param up
     * this parameter is true if the snake's direction is to be set to up.
     */
    public void setUp(boolean up) { this.up = up; }

    /**
     * This method is a setter for setting the snake's current direction of
     * travel as down.
     * @param down
     * this parameter is true if the snake's direction is to be set to down.
     */
    public void setDown(boolean down) { this.down = down; }

    /**
     * This method is a setter for the new image of the snake's head.
     * @param newImgSnakeHead
     * this parameter takes in an image of the snake's head and sets it as
     * a variable in this class.
     */
    public void setNewImgSnakeHead(BufferedImage newImgSnakeHead) {
        this.m_newImgSnakeHead = newImgSnakeHead;
    }

    /**
     * This method is a setter for the image of the snake's head
     * @param snakeHead
     * this parameter takes in the image of the snake head to be set.
     */
    public void setImgSnakeHead(BufferedImage snakeHead) {
        this.m_IMG_SNAKE_HEAD =  snakeHead;
    }

    /**
     * This method is a setter for the speed of the snake.
     * @param speed
     * this parameter takes in the integer value of the speed of the snake.
     */
    public void setSpeed(Integer speed) { this.m_speed_XY = speed; }

    /**
     * This method is a setter for the length of the snake.
     * @param length
     * this parameter takes in the integer value of the length of the snake to
     * be set.
     */
    public void setLength(Integer length) { this.m_length = length; }

    /**
     * This method is a setter for the num variable.
     * @param num
     * this parameter takes in the integer value that num is going to be set to.
     */
    public void setNum(Integer num) { this.m_num = num; }

    /**
     * This setter method is called when the length of the snake needs to be
     * changed.
     * @param length
     * this parameter takes in the new length for the snake to be set to.
     */
    public void changeLength(int length) { this.m_length = length; }

    /**
     * this variable contains the new linked list created for the body points
     * of the snake.
     */
    private final List<Point> m_bodyPoints = new LinkedList<>();

    /**
     * this boolean variable is set to "true" if the current direction of travel
     * of the snake is left.
     */
    private boolean left;

    /**
     * this boolean variable is set to "true" if the current direction of travel
     * of the snake is right.
     */
    private boolean right = true;

    /**
     * this boolean variable is set to "true" if the current direction of travel
     * of the snake is up.
     */
    private boolean up;

    /**
     * this boolean variable is set to "true" if the current direction of travel
     * of the snake is down.
     */
    private boolean down;

    /**
     * this variable contains the buffered image of the snake's head.
     */
    private BufferedImage m_newImgSnakeHead;

    /**
     * this variable contains the integer value of the speed of the
     * snake's movement.
     */
    private int m_speed_XY;

    /**
     * this variable contains the integer value of the length of the snake.
     */
    private int m_length;

    /**
     * this variable contains the integer value for "num".
     */
    private int m_num;

    /**
     * this variable contains the integer value of the score that the user
     * is currently on.
     */
    public int m_score = 0;

    /**
     * this variable is initialised as null and would intend to contain
     * the image of the snake's head.
     */
    private BufferedImage m_IMG_SNAKE_HEAD = null;

    /**
     * This is the constructor for the Snake object.
     * @param x
     * this parameter takes in the x position of the snake to start at when
     * the game begins.
     * @param y
     * this parameter takes in the y position of the snake to start at when the
     * game begins.
     * @param imgUtil
     * this parameter takes in the ImageUtil object that is used to get images
     * for objects within the game.
     * @param snakeChoice
     * this parameter takes in the type of snake that the user has requested.
     */
    public Snake(int x, int y, ImageUtil imgUtil, String snakeChoice) {
        if(Objects.equals(snakeChoice, "default")) {
            setImgSnakeHead((BufferedImage) imgUtil.getImages().get
                    ("snake-head-right"));
            setI(imgUtil.getImages().get("snake-body"));
        }
        if(Objects.equals(snakeChoice, "square")) {
            setImgSnakeHead((BufferedImage) imgUtil.getImages().get
                    ("whitesquare"));
            setI(imgUtil.getImages().get("whitesquare"));
        }
        setL(true);
        setX(x);
        setY(y);
        setW(getI().getWidth(null));
        setH(getI().getHeight(null));
        setNewImgSnakeHead(getImgSnakeHead());
        setSpeed(5);
        setLength(1);
        setNum(getW() / getSpeed());
    }

    /**
     * This method increases the users score by the parameter value that it is
     * given.
     * @param increaseBy
     * this parameter takes in the integer value to increase the score by.
     */
    public void increaseScore(int increaseBy) { this.m_score += increaseBy; }

    /**
     * This method is responsible for moving the snake when it is called.
     */
    public void move()
    {
        if (isUp())
        {
            setY(getY() - getSpeed());
        } else if (isDown())
        {
            setY(getY() + getSpeed());
        } else if (isLeft())
        {
            setX(getX() - getSpeed());
        } else if (isRight())
        {
            setX(getX() + getSpeed());
        }
    }

    /**
     * This method updates the GUI in the game window when called.
     * @param g
     * the <code>Graphics</code> context in which to paint
     */
    @Override
    public void draw(Graphics g)
    {
        outofBounds();
        eatBody();
        getBodyPoints().add(new Point(getX(), getY()));
        if (getBodyPoints().size() == (getLength() + 1) * getNum())
        {
            getBodyPoints().remove(0);
        }
        g.drawImage(getNewImgSnakeHead(), getX(), getY(), null);
        drawBody(g);
        move();
    }

    /**
     * This method is responsible for determining if the snake has "eaten itself"
     * or not.
     */
    public void eatBody()
    {
        for (Point point : getBodyPoints())
        {
            for (Point point2 : getBodyPoints())
            {
                if (point.equals(point2) && point != point2)
                {
                    setL(false);
                }
            }
        }
    }

    /**
     * This method is responsible for drawing the body of the snake.
     * @param g
     * the <code>Graphics</code> context in which to paint
     */
    public void drawBody(Graphics g)
    {
        int length = getBodyPoints().size() - 1 - getNum();

        for (int i = length; i >= getNum(); i -= getNum())
        {
            Point point = getBodyPoints().get(i);
            g.drawImage(getI(), point.x, point.y, null);
        }
    }

    /**
     * This method is responsible for checking whether the snake is currently
     * out of bounds or not.
     */
    private void outofBounds()
    {
        boolean xOut = (getX() < 0 || getX() >= WIDTH);
        boolean yOut = (getY() < 0 || getY() >= HEIGHT-50);
        if (xOut || yOut)
        {
            setL(false);
        }
    }
}