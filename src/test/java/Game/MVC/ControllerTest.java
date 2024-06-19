package Game.MVC;

import Menu.MC.Scoreboard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    Model model = new Model("dark", "square",
            1, 1);
    Scoreboard scoreboard = new Scoreboard();
    Controller controller = new Controller(model, scoreboard);

    ControllerTest() throws URISyntaxException, IOException {
    }

    @Test
    @DisplayName("JFrame Tests")
    void JFrameTests() {
        JFrame frame = new JFrame();
        controller.setJFrame(frame);
        if(controller.getJFrame() == frame) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Scoreboard tests")
    void scoreboardTests() {
        if(controller.getScoreboard() == scoreboard) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Model tests")
    void modelTests() {
        if(controller.getModel() == model) {
            assertTrue(true);
        } else {
            fail();
        }
    }
}