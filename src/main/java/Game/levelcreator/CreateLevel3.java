package Game.levelcreator;

import Game.SnakeObjects.Obstacle;
import Game.util.ImageUtil;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class is the object creator for level 3
 * @author Thomas Neal
 */
public class CreateLevel3 extends Level implements LevelCreator {

    /**
     * This method creates the ArrayList of obstacles needed for level 3.
     * @return
     * returns the ArrayList of the walls positions.
     */
    @Override
    public ArrayList<Obstacle> createLevel() {
        ArrayList<Point> obstaclePositions = new ArrayList<>();

        obstaclePositions.add(new Point(450, 100));
        obstaclePositions.add(new Point(600, 100));
        obstaclePositions.add(new Point(300, 100));
        obstaclePositions.add(new Point(150, 100));
        obstaclePositions.add(new Point(750, 100));

        obstaclePositions.add(new Point(450, 200));
        obstaclePositions.add(new Point(600, 200));
        obstaclePositions.add(new Point(300, 200));
        obstaclePositions.add(new Point(150, 200));
        obstaclePositions.add(new Point(750, 200));

        obstaclePositions.add(new Point(450, 300));
        obstaclePositions.add(new Point(600, 300));
        obstaclePositions.add(new Point(300, 300));
        obstaclePositions.add(new Point(150, 300));
        obstaclePositions.add(new Point(750, 300));

        obstaclePositions.add(new Point(450, 400));
        obstaclePositions.add(new Point(600, 400));
        obstaclePositions.add(new Point(300, 400));
        obstaclePositions.add(new Point(150, 400));
        obstaclePositions.add(new Point(750, 400));

        super.setObstacles(obstaclePositions);
        return super.getObstacles();
    }

    /**
     * The constructor for the class
     * @param util
     * takes in the ImageUtil object, used for getting images.
     */
    public CreateLevel3(ImageUtil util) {
        super(util);
    }
}
