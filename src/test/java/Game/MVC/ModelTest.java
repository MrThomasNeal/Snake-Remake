package Game.MVC;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    Model model = new Model("dark", "square",
            1, 1);

    ModelTest() throws URISyntaxException {
    }

    @Test
    @DisplayName("Multiplier Tests")
    void multiplierSetterAndGetterTest() {
        boolean attempt1, attempt2;
        model.setMultiplier(3);
        if(model.getMultiplier() == 3) {
            attempt1 = true;
        } else {
            attempt1 = false;
            fail();
        }
        model.setMultiplier(5);
        attempt2 = model.getMultiplier() == 5;
        if(attempt2) {
            assertTrue(true);
        } else {
            fail();
        }
    }
}