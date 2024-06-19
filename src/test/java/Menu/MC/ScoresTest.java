package Menu.MC;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ScoresTest {

    Scores scores = new Scores("tom", 5);

    @Test
    @DisplayName("Constructor Tests")
    void constructorTests() {
        if(Objects.equals(scores.getName(), "tom") && scores.getScore() == 5)
        {
            assertTrue(true);
        } else {
            fail();
        }
    }
}