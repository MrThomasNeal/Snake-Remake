package Game.levelcreator;

import Game.SnakeObjects.Obstacle;
import Game.util.ImageUtil;

import java.util.ArrayList;

/**
 * This class is the interface for creating levels.
 * @author Thomas Neal
 */
public interface LevelCreator {
    ArrayList<Obstacle> createLevel();
}
