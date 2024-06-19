package Game.SnakeObjects;

import Game.util.GameUtil;
import Game.util.ImageUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class ObjectFactoryTest {

    ObjectFactory factory = new ObjectFactory();
    GameUtil util = new GameUtil();
    ImageUtil imgUtil = new ImageUtil(util);

    ObjectFactoryTest() throws URISyntaxException {
    }

    @Nested
    @DisplayName("get() method tests")
    class getMethodTests {

        @Test
        @DisplayName("Snake Test")
        void snakeTest() {
            Snake snake = (Snake) factory.get("snake", imgUtil,
                    "square", null, 3);
            if(snake.getY() == 0 && snake.getX() == 0) {
                assertTrue(true);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("Food Test")
        void foodTest() {
            Food food = (Food) factory.get("food", imgUtil,
                    null, null, 3);
            if(food.getMultiplier() == 3) {
                assertTrue(true);
            } else {
                fail();
            }
        }
    }
}