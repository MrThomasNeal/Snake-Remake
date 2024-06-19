package Game.music;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {

    MusicPlayer mp = new MusicPlayer();

    @Test
    @DisplayName("Play Music Tests")
    void getMusicPlayTests() {
        mp.getMusicPlay("/music/frogger.mp3");
        if(mp.isMusicPlaying()) {
            assertTrue(true);
        } else {
            fail();
        }
    }


}