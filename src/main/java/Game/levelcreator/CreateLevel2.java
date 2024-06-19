package Game.levelcreator;

import Game.SnakeObjects.Obstacle;
import Game.util.ImageUtil;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class is the object creator for level 2
 * @author Thomas Neal
 */
public class CreateLevel2 extends Level implements LevelCreator{

    /**
     * This method creates the ArrayList of obstacles needed for level 2.
     * @return
     * returns the ArrayList of the walls positions.
     */
    @Override
    public ArrayList<Obstacle> createLevel() {
        ArrayList<Point> obstaclePositions = new ArrayList<>();

        obstaclePositions.add(new Point(450, 200));
        obstaclePositions.add(new Point(600, 200));
        obstaclePositions.add(new Point(300, 200));
        obstaclePositions.add(new Point(150, 200));
        obstaclePositions.add(new Point(750, 200));

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
    public CreateLevel2(ImageUtil util) {
        super(util);
    }
}
