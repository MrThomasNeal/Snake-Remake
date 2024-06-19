package Game.SnakeObjects;

import Game.util.ImageUtil;

import java.awt.*;
import java.util.Objects;

/**
 * This class is the object factory used to return objects to its caller
 * based on the parameters used in the get() method.
 * @author Thomas Neal
 */
public class ObjectFactory {
    /**
     * This method takes in five parameters and based on the values of the
     * parameters, the method will return the respective object to its caller.
     * @param choice
     * this variable is a container for the choice of object that its caller
     * wants.
     * @param util
     * this variable is a container for the ImageUtil object which is used
     * to get images to be displayed.
     * @param snakeChoice
     * this variable is a container for the choice of snake that the user would
     * like to play using.
     * @return
     * This method will either return the requested object or if the choice
     * is not valid, it will return null.
     */
    public SnakeObject get(String choice, ImageUtil util, String snakeChoice,
                           Point position, Integer multiplier) {
        if(Objects.equals(choice, "snake")) {
            return new Snake(0, 0, util, snakeChoice);
        }
        else if(Objects.equals(choice, "food")) {
            return new Food(util, multiplier);
        }
        else if(Objects.equals(choice, "obstacle")) {
            return new Obstacle(util, position);
        }
        else {
            return null;
        }
    }
}
