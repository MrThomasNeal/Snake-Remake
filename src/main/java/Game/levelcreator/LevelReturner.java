package Game.levelcreator;

import Game.SnakeObjects.Obstacle;

import java.util.ArrayList;

/**
 * This class is responsible for containing and creating the level object.
 * @author Thomas Neal
 */
public class LevelReturner {

    /**
     * This method is a getter for the levelCreator object.
     * @return
     * This method returns the levelCreator object.
     */
    public LevelCreator get_levelCreator() {
        return m_levelCreator;
    }

    /**
     * This constructor works as a setter for the level object.
     * @param level
     * This method returns the level object.
     */
    public LevelReturner(LevelCreator level) {
        this.m_levelCreator = level;
    }

    /**
     * this variable contains the level object set by the constructor.
     */
    private final LevelCreator m_levelCreator;

    /**
     * This method creates the level and returns an ArrayList of the level's
     * positions.
     * @return
     * This method returns an ArrayList of the level's positions.
     */
    public ArrayList<Obstacle> executeCreator() {
        return get_levelCreator().createLevel();
    }
}
