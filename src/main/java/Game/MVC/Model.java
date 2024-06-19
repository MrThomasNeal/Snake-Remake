package Game.MVC;

import Game.SnakeObjects.*;
import Game.levelcreator.*;
import Game.util.GameUtil;
import Game.util.ImageUtil;
import java.awt.*;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * This class represents an object carrying data for the game to work such as
 * objects and variables.
 */
public class Model {

    /**
     * This method is a getter for the snake object.
     * @return
     * This method returns the snake object.
     */
    public Snake getSnake() { return (Snake) m_snake; }

    /**
     * This method is a getter for the food object.
     * @return
     * This method returns the food object.
     */
    public Food getFood() { return (Food) m_food; }

    /**
     * This method is a getter for the background variable of type Image.
     * @return
     * This method returns m_background which is the variable for the background
     * image of the game.
     */
    public Image getBackground() { return m_background; }

    /**
     * This method is a getter for the fail image which is displayed when the
     * user dies in the game.
     * @return
     * This method returns m_fail which is the variable for the image displayed
     * on the screen when the user dies in the game.
     */
    public Image getFail() { return m_fail; }

    /**
     * This method is a getter for the GameUtil object which is used for getting
     * images and rotating images.
     * @return
     * This method returns the m_util object of this class to its caller.
     */
    public GameUtil getUtil() { return m_util; }

    /**
     * This method is a getter for the ImageUtil object which is used for
     * getting images.
     * @return This method returns the m_ImgUtil object of this class to its
     * caller.
     */
    public ImageUtil getImgUtil() { return this.m_imgUtil; }

    /**
     * This method is a getter for the value of the set score multiplier.
     * @return
     * This method returns an integer value of the multiplier set by the user
     * for the score.
     */
    public Integer getMultiplier() { return this.m_multiplier; }

    /**
     * This method returns the array list of obstacles that need to be placed
     * on the map.
     * @return
     * returns the array list of the obstacles positions.
     */
    public ArrayList<Obstacle> getObstacles() { return m_obstacles; }

    /**
     * This method is a getter for the ObjectFactory method, used for creating
     * food/snake objects.
     * @return
     */
    public ObjectFactory getFactory() { return this.m_factory; }

    /**
     * This method is a getter for the level object.
     * @return
     * This method returns the LevelReturner object which represents the level
     * chosen by the user on the menu.
     */
    private LevelReturner getLevel() { return this.m_level; }

    /**
     * This method is a setter for the obstacles array, which contains the
     * positions of the obstacles that are going to be placed on the map.
     * @param obstacles
     * this variable contains an array list containing the positions of the
     * obstacles that are going to be placed on the map.
     */
    public void setObstacles(ArrayList<Obstacle> obstacles) {
        this.m_obstacles = obstacles;
    }

    /**
     * This object is a setter for the ObjectFactory object which is used
     * to create objects such as food and snake objects.
     * @param factory
     * this parameter contains the factory object.
     */
    public void setFactory(ObjectFactory factory) { this.m_factory = factory; }

    /**
     * This method is a setter for the food object. It sets the food object
     * to the object returned by calling the object factory depending on the
     * parameters.
     */
    public void setFood() {
        this.m_food = getFactory().get("food", getImgUtil(),
                null, null, getMultiplier());
    }

    /**
     * This method is a setter for the multiplier value that will multiply the
     * users score each time they get a new point.
     * @param multiplier
     * this parameter takes in the integer value representing the score
     * multiplier set by the user on the menu.
     */
    public void setMultiplier(Integer multiplier) {
        this.m_multiplier = multiplier;}

    /**
     * This method is a setter for the level object depending on which level
     * the user chose on the main menu.
     * @param level
     * this parameter takes in the level object which is chosen by the user on
     * the main menu.
     */
    public void setLevel(LevelReturner level) { this.m_level = level;}

    /**
     * This method is a setter for the SnakeObject object representing the snake.
     * @param snake
     * this parameter takes in the snake object.
     */
    public void setSnake(SnakeObject snake) { this.m_snake = snake; }

    /**
     * This method is a setter for the background object used to set the
     * background of the window when the game is playing (the theme).
     * @param background
     * this parameter takes in the background image that is going to be set in
     * the game window.
     */
    public void setBackground(Image background){this.m_background = background;}

    /**
     * this variable represents the new made GameUtil object so that this class
     * and the ImageUtil can use its getImage() and rotateImage method
     */
    private final GameUtil m_util = new GameUtil();

    /**
     * this variable represents the new made ImageUtil object so that this class
     * can access the required images for the game to work as planned.
     */
    private final ImageUtil m_imgUtil = new ImageUtil(getUtil());

    /**
     * this variable is a container for this class's m_snake object which is
     * set by calling factory.get() then using the appropriate parameters.
     */
    private SnakeObject m_snake;

    /**
     * this variable is a container for the food object which is set by calling
     * factory.get() then using the appropriate parameters.
     */
    private SnakeObject m_food;

    /**
     * this variable is a container for the background image of the game that
     * is displayed when you are playing the game.
     */
    private Image m_background;

    /**
     * this variable is a container for the factory object, which is used to
     * obtain certain objects based upon the parameters passed into it.
     */
    private ObjectFactory m_factory;

    /**
     * this variable contains the score multiplier integer. e.g. if this
     * variable is set to 3, each time the snake eats a food, score will
     * increase by 3.
     */
    private Integer m_multiplier;

    /**
     * this variable is a container for the image that is displayed on the
     * game when the user dies and fails.
     */
    private final Image m_fail = getImgUtil().getImages().get("game-scene-01");

    /**
     * this variable is a container for the array list containing all the
     * positions of the obstacles to be placed on the map.
     */
    private ArrayList<Obstacle> m_obstacles;

    /**
     * this variable contains the object needed for whatever level the user
     * has chosen.
     */
    private LevelReturner m_level;

    /**
     * This constructor takes in the theme and choice of snake that the user
     * makes on the main menu. The constructor calls factory.get() twice and
     * uses it to create two new objects (the snake + food object) and stores
     * them in the appropriate variables (m_snake/m_food). Also, this method
     * sets the background image of the game dependant upon the theme choice
     * parameter that is passed in.
     * @param theme
     * contains the String value of what theme the user chose to use for the
     * game when playing.
     * @param snakeChoice
     * contains the String value of what type of snake the user wants to play
     * using when playing.
     */
    Model(String theme, String snakeChoice, int levelChoice, Integer multiplier)
            throws URISyntaxException {
        setFactory(new ObjectFactory());
        setMultiplier(multiplier);
        if(levelChoice == 1) {
            setLevel(new LevelReturner(new CreateLevel1(getImgUtil())));
        }
        if(levelChoice == 2) {
            setLevel(new LevelReturner(new CreateLevel2(getImgUtil())));
        }
        if(levelChoice == 3) {
            setLevel(new LevelReturner(new CreateLevel3(getImgUtil())));
        }
        // ADD CHOICE HERE FOR LEVEL CHOICE
        setSnake(getFactory().get("snake", getImgUtil(), snakeChoice,
                null, multiplier));
        setFood();
        setBackground(getUtil().getImage(theme));
        setObstacles(getLevel().executeCreator());
    }
}
