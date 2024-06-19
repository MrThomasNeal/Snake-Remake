package Game.levelcreator;

import Game.SnakeObjects.Obstacle;
import Game.util.ImageUtil;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class is the model for level 1.
 * @author Thomas Neal
 */
public class CreateLevel1 extends Level implements LevelCreator{

    /**
     * This method creates the ArrayList of obstacles needed for level 1.
     * @return
     * returns the ArrayList of the walls positions.
     */
    @Override
    public ArrayList<Obstacle> createLevel() {
        ArrayList<Point> obstaclePositions = new ArrayList<>();

        obstaclePositions.add(new Point(450, 300)); // MIDDLE
        obstaclePositions.add(new Point(600, 300));
        obstaclePositions.add(new Point(300, 300));
        obstaclePositions.add(new Point(150, 300));
        obstaclePositions.add(new Point(750, 300));

        super.setObstacles(obstaclePositions);
        return super.getObstacles();
    }

    /**
     * The constructor for the class
     * @param util
     * takes in the ImageUtil object, used for getting images.
     */
    public CreateLevel1(ImageUtil util) {
        super(util);
    }
}
