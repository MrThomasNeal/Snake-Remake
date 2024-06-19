package Game.util;

import Game.util.GameUtil;
import Game.util.ImageUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class ImageUtilTest {

    private final GameUtil m_util = new GameUtil();
    private final ImageUtil m_imgUtil = new ImageUtil(m_util);

    ImageUtilTest() throws URISyntaxException {
    }

    @Test
    @DisplayName("Hash Map Test")
    void hashMapTests() {
        int count = m_imgUtil.getImages().size();
        // should be 21 entries in the hashmap
        if(count == 21) {
            assertTrue(true);
        } else {
            fail();
        }
    }

}