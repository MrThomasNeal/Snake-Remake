package Menu.MC;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    Controller controller = new Controller();


    ControllerTest() throws IOException, URISyntaxException {
    }

    @Test
    @DisplayName("Multiplier Tests")
    void multiplierSetterAndGetterTest() {
        boolean attempt1, attempt2;
        controller.setMultiplier(3);
        if(controller.getMultiplier() == 3) {
            attempt1 = true;
        } else {
            attempt1 = false;
            fail();
        }
        controller.setMultiplier(5);
        attempt2 = controller.getMultiplier() == 5;
        if(attempt2) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Name Tests")
    void nameTests() {
        String name1 = "tom";
        String name2 = "neal";
        controller.setName(name1);
        if(Objects.equals(controller.getName(), name1)) {
            assertTrue(true);
        } else {
            fail();
        }
        controller.setName(name2);
        if(Objects.equals(controller.getName(), name2)) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Theme Tests")
    void themeTests() {
        boolean test1, test2, test3;
        controller.setLudicrous(null);
        if(Objects.equals(controller.getMusicChoice(), "ludicrous")) {
            test1 = true;
        } else {
            test1 = false;
            fail();
        }
        controller.setMediocre(null);
        if(Objects.equals(controller.getMusicChoice(), "mediocre")) {
            test2 = true;
        } else {
            test2 = false;
            fail();
        }
        controller.setRelaxation(null);
        if(Objects.equals(controller.getMusicChoice(), "relaxation")) {
            test3 = true;
        } else {
            test3 = false;
            fail();
        }
        if(test1 && test2 && test3) {
            assertTrue(true);
        } else {
            fail();
        }

    }
}