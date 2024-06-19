package Game.MVC;
import Game.SnakeObjects.Obstacle;
import Menu.MC.Scoreboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static java.lang.Thread.sleep;

/**
 * This class is used to manage to flow of the game by working on both the model
 * and view, updating the view whenever data is changed.
 * @author Thomas Neal
 */
public class Controller {

    /**
     * This method is a getter for this classes Model object which is passed
     * into the constructor from its caller.
     * @return
     * This method returns m_model, the variable containing the Model object.
     */
    public Model getModel() {
        return m_model;
    }

    /**
     * This method is a getter for the scoreboard object, which is pased into
     * this classes constructor from its caller.
     * @return
     * This method's returns scoreboard, the variable containing the scoreboard
     * object.
     */
    public Scoreboard getScoreboard() {
        return m_scoreboard;
    }

    /**
     * This method is a getter for the JFrame object so that the Controller
     * can interact with the frame of the game.
     * @return
     * This method returns the JFrame object.
     */
    public JFrame getJFrame() { return this.m_frame; }

    /**
     * This method is a setter for the JFrame object so that the Controller
     * can interact with the frame of the game.
     * @param jframe
     * this variable is a container for the JFrame object.
     */
    public void setJFrame(JFrame jframe) {
        this.m_frame = jframe;
    }

    /**
     * this variable is a container for the Model object that the controller
     * interacts with the control the game.
     */
    private final Model m_model;

    /**
     * this variable is a container for the Scoreboard object that this class
     * interacts with to enable the high scores feature.
     */
    private final Scoreboard m_scoreboard;

    /**
     * this variable is a container for the JFrame object, which is used for
     * GUI creation / customisation.
     */
    private JFrame m_frame;

    /**
     * This is the constructor for the Controller class.
     * @param model
     * this parameter is the Model object that this class will interact with
     * to update and control the View object.
     * @param scoreboard
     * this parameter takes in the Scoreboard object which is used to enable
     * functionality of the scoreboard feature included within the game.
     */
    public Controller(Model model, Scoreboard scoreboard) {
        this.m_model = model;
        this.m_scoreboard = scoreboard;
    }

    /**
     * This method is called when the user presses a key when playing the game,
     * and based upon which key was pressed, the function will alter the snake's
     * direction of travel.
     * @param e
     * this parameter tells us some information about what key is pressed etc,
     * allowing different actions to occur depending on the input from the user
     */
    public void keyPressed(KeyEvent e) {
        final int UP = -90;
        final int DOWN = 90;
        final int LEFT = -180;
        {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    if (!getModel().getSnake().isDown()) {
                        getModel().getSnake().setUp(true);
                        getModel().getSnake().setDown(false);
                        getModel().getSnake().setLeft(false);
                        getModel().getSnake().setRight(false);
                        getModel().getSnake().setNewImgSnakeHead((BufferedImage)
                                getModel().getUtil().rotateImage
                                (getModel().getSnake().getIMG_SNAKE_HEAD(),
                                        UP));
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (!getModel().getSnake().isUp()) {
                        getModel().getSnake().setUp(false);
                        getModel().getSnake().setLeft(false);
                        getModel().getSnake().setRight(false);
                        getModel().getSnake().setDown(true);
                        getModel().getSnake().setNewImgSnakeHead((BufferedImage)
                                getModel().getUtil().rotateImage
                                (getModel().getSnake().getIMG_SNAKE_HEAD(),
                                        DOWN));
                    }
                    break;

                case KeyEvent.VK_LEFT:
                    if (!getModel().getSnake().isRight()) {
                        getModel().getSnake().setUp(false);
                        getModel().getSnake().setLeft(true);
                        getModel().getSnake().setRight(false);
                        getModel().getSnake().setDown(false);
                        getModel().getSnake().setNewImgSnakeHead((BufferedImage)
                                getModel().getUtil().rotateImage
                                (getModel().getSnake().getIMG_SNAKE_HEAD(),
                                        LEFT));

                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (!getModel().getSnake().isLeft()) {
                        getModel().getSnake().setUp(false);
                        getModel().getSnake().setLeft(false);
                        getModel().getSnake().setRight(true);
                        getModel().getSnake().setDown(false);
                        getModel().getSnake().setNewImgSnakeHead(getModel().
                                getSnake().getIMG_SNAKE_HEAD());
                    }

                default:
                    break;
            }
        }
    }

    /**
     * This method updates the GUI based on certain conditions such has if the
     * snake has come into contact with food/the wall. It is responsible
     * for the game "moving".
     * @param g
     * this parameter is the variable for the Graphics object.
     * @throws IOException
     * if there is an error with the scoreboard object reading/writing to the
     * scores file, this exception will be thrown.
     * @throws InterruptedException
     * this exception is thrown when the thread that repaints the game is
     * interrupted.
     */
    public void paint(Graphics g) throws IOException, InterruptedException {
        g.drawImage(getModel().getBackground(), 0, 0, null);
        renderWalls(g);
        if (getModel().getSnake().isL())
        {
            getModel().getSnake().draw(g);
            if (getModel().getFood().isL())
            {
                getModel().getFood().draw(g);
                getModel().getFood().eaten(getModel().getSnake());
            } else
            {
                getModel().setFood();
            }
        } else
        {
            g.drawImage(getModel().getFail(), 0, 0, null);
            getScoreboard().setScore(String.valueOf(getModel().getSnake().
                    getScore()));
            getScoreboard().newEntry();
            sleep(2000);
            getScoreboard().sortFile();
            getJFrame().dispose();
        }
        drawScore(g);
    }

    /**
     * This method renders the walls into the game by using draw() to get
     * the walls placed in their position set by the Level object.
     * @param g
     * this parameter is the variable for the Graphics object.
     */
    private void renderWalls(Graphics g) {
        for(Obstacle obstacle : getModel().getObstacles()) {
            obstacle.draw(g);
            obstacle.hits(getModel().getSnake());
        }
    }

    /**
     * This method is responsible for displaying and updating the score on the
     * game window.
     * @param g
     * this parameter is the variable for the Graphics object.
     */
    private void drawScore(Graphics g) {
        final int SCORE_SIZE = 30;
        final int X_SPACING = 20;
        final int Y_SPACING = 40;
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, SCORE_SIZE));
        g.setColor(Color.MAGENTA);
        g.drawString("SCORE: " + getModel().getSnake().getScore(), X_SPACING,
                Y_SPACING);
    }
}
