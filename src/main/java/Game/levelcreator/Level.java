package Game.levelcreator;

import Game.SnakeObjects.ObjectFactory;
import Game.SnakeObjects.Obstacle;
import Game.util.ImageUtil;

import java.awt.*;
import java.util.ArrayList;

/**
 * This method is the model for levels.
 * @author Thomas Neal
 */
public abstract class Level {

    /**
     * This method is a getter for the array of the walls positions to be placed
     * on the map.
     * @return
     */
    public ArrayList<Obstacle> get_walls() {
        return m_walls;
    }

    /**
     * This method is a getter for the "walls" objects.
     * @return
     */
    public ArrayList<Obstacle> getObstacles() {
        return m_walls;
    }

    /**
     * This method is a getter for ImageUtil object.
     * @return
     * This method returns the ImageUtil object.
     */
    public ImageUtil getUtil() {
        return m_imgUtil;
    }

    /**
     * This method translates the array of obstacles and their positions into
     * "wall" objects ready to be placed appropriately on the game map.
     * @param ap
     */
    public void setObstacles(ArrayList<Point> ap) {
        ObjectFactory of = new ObjectFactory();
        for(Point p : ap) {
            this.get_walls().add((Obstacle)
                    of.get("obstacle", getUtil(), null, p,
                            null));
        }
    }

    /**
     * This method is a setter for ImageUtil object.
     */
    public void setUtil(ImageUtil util) { this.m_imgUtil = util; }

    /**
     * This variable contains the ImageUtil object that is used to get images.
     */
    private ImageUtil m_imgUtil;

    /**
     * This variable contains the newly created ArrayList of walls of type
     * "Obstacle".
     */
    private final ArrayList<Obstacle> m_walls = new ArrayList<>();

    /**
     * This is the constructor for the Level class.
     * @param util
     * this parameter takes in the ImageUtil object to get images and stores it
     * at "this.m_util".
     */
    public Level(ImageUtil util) {
        setUtil(util);
    }
}
