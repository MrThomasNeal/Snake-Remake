package Game.SnakeObjects;

import Game.util.GameUtil;
import Game.util.ImageUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    private final GameUtil m_util = new GameUtil();
    private final ImageUtil m_imgUtil = new ImageUtil(m_util);
    Food food = new Food(m_imgUtil, 100);

    FoodTest() throws URISyntaxException {
    }

    @Nested
    @DisplayName("Constructor Tests")
    class constructorTests {
        @Test
        @DisplayName("I")
        void testForVariableI() {
            //food-lemon (width & height = 32)
            food.setI(m_imgUtil.getImages().get(String.valueOf(1)));
            food.setW(food.getI().getWidth(null));
            food.setH(food.getI().getHeight(null));
            if((food.getW() == 32) && (food.getH() == 32)) {
                assertTrue(true);
            } else {
                fail();
            }
        }
        @Test
        @DisplayName("X + Y")
        void testForVariableXY() {
            Random random = new Random();
            int randomHeightInt;
            int randomWidthInt;
            int HEIGHT = 32;
            int WIDTH = 32;
            randomHeightInt = random.nextInt(HEIGHT)-50;
            randomWidthInt = random.nextInt(WIDTH)-50;
            food.setX(randomHeightInt);
            food.setY(randomWidthInt);
            if(food.getX() == randomHeightInt && food.getY() == randomWidthInt){
                assertTrue(true);
            } else {
                fail();
            }

        }
    }

}