package Game.util;

import Game.util.GameUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilTest {

    private final GameUtil m_util = new GameUtil();
    boolean thrown;
    @Test
    @DisplayName("Get Image Tests")
    void getImageTests() {
        try {
            m_util.getImage("/assets/sprites/food-kiwi.png");
        } catch (Exception e) {
            thrown = true;
        }
        if(!thrown) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Image Existence Tests")
    void imageExistenceTests() {
        // File below EXISTS in the /assets/ folder which we are testing for
        boolean test = m_util.imageExistence(
                "UI-background.png");
        if(test) {
            assertTrue(true);
        } else {
            fail();
        }
    }

}