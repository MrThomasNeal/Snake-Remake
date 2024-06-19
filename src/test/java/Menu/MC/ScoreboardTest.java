package Menu.MC;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ScoreboardTest {

    Scoreboard scoreboard = new Scoreboard();

    ScoreboardTest() throws IOException {}

    @Test
    @DisplayName("Name tests")
    void nameTests() {
        scoreboard.setName("tom");
        if(Objects.equals(scoreboard.getName(), "tom")) {
            assertTrue(true);
        } else {
            fail();
        }
        scoreboard.setName("neal");
        if(scoreboard.getName() == "neal") {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("File name tests")
    void filenameTests() {
        if(scoreboard.getFilename() == "scores.txt") {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Scores tests")
    void scoresTests() {
        scoreboard.setScore("3");
        if(Objects.equals(scoreboard.getScore(), "3")) {
            assertTrue(true);
        } else {
            fail();
        }
        scoreboard.setScore("10");
        if(Objects.equals(scoreboard.getScore(), "10")) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    @DisplayName("Create files tests")
    void createScoresFilesTests() throws IOException {
        // First time running this test should fail, but pass everytime after
        boolean files = scoreboard.createScoresFiles();
        if(files) {
            fail();
        } else {
            assertTrue(true);
        }
    }


}