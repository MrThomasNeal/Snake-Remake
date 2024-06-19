package Game.SnakeObjects;

import Game.util.GameUtil;
import Game.util.ImageUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

public class SnakeTest {

    private final GameUtil m_util = new GameUtil();
    private final ImageUtil m_imgUtil = new ImageUtil(m_util);
    private String snakeChoice = "default";
    Snake snake = new Snake(300, 300, m_imgUtil, snakeChoice);

    public SnakeTest() throws URISyntaxException {
    }

    @Nested
    @DisplayName("Setters and Getters Tests")
    class settersAndGettersTests {

        boolean trueTest;
        boolean falseTest;

        @Test
        @DisplayName("Left tests")
        void left() {
            snake.setLeft(true);
            if(snake.isLeft()) {
                trueTest = true;
            } else {
                trueTest = false;
                fail();
            }
            snake.setLeft(false);
            if(snake.isLeft()) {
                falseTest = true;
            } else {
                falseTest = false;
                fail();
            }
            if(trueTest && falseTest) {
                assertTrue(true);
            }

        }
        @Test
        @DisplayName("Right tests")
        void right() {
            snake.setRight(true);
            if(snake.isRight()) {
                trueTest = true;
            } else {
                trueTest = false;
                fail();
            }
            snake.setRight(false);
            if(snake.isRight()) {
                falseTest = true;
            } else {
                falseTest = false;
                fail();
            }
            if(trueTest && falseTest) {
                assertTrue(true);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("Up tests")
        void up() {
            snake.setUp(true);
            if(snake.isUp()) {
                trueTest = true;
            } else {
                fail();
            }
            snake.setUp(false);
            if(snake.isUp()) {
                falseTest = true;
            } else {
                fail();
            }
            if(trueTest && falseTest) {
                assertTrue(true);
            } else {
                fail();
            }
        }
        @Test
        @DisplayName("Down tests")
        void down() {
            snake.setDown(true);
            if(snake.isDown()) {
                trueTest = true;
            } else {
                trueTest = false;
                fail();
            }
            snake.setDown(false);
            if(snake.isDown()) {
                falseTest = true;
            } else {
                falseTest = false;
                fail();
            }
            if(trueTest && falseTest) {
                assertTrue(true);
            } else {
                fail();
            }
        }
    }

    @Test
    @DisplayName("Constructor Tests")
    void constructorTests() {
        if((snake.getX() == 300) && (snake.getY() == 300)) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Nested
    @DisplayName("Length Tests")
    class lengthTests {
        @Test
        @DisplayName("Length 1")
        void one() {
            snake.changeLength(1);
            if(snake.getLength() == 1) {
                assertTrue(true);
            } else {
                fail();
            }
        }
        @Test
        @DisplayName("Length 5")
        void five() {
            snake.changeLength(5);
            if(snake.getLength() == 5) {
                assertTrue(true);
            } else {
                fail();
            }
        }
        @Test
        @DisplayName("Length 101")
        void testingDecimals() {
            snake.changeLength(101);
            if(snake.getLength() == 101) {
                assertTrue(true);
            } else {
                fail();
            }
        }
    }
}