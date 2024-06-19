package Game.MVC;

import Game.music.MusicPlayer;
import Menu.MC.Scoreboard;

import java.net.URISyntaxException;
import java.util.Objects;

/**
 * This is the class where the game is run from, it creates all the required
 * objects and the music player in order to make the game work
 * @author Thomas Neal - modified
 */
public class Play {

    /**
     * This method is a getter for the path of the music that is going to be
     * played when the game is running.
     * @return
     * This method returns the String value of the path of the music file that
     * is going to be played when the game is running.
     */
    public String getMusicPath() { return this.m_musicPath; }

    /**
     * This method is a setter for the path of the music file that is going to
     * be played when the game is running.
     * @param path
     * This parameter takes in the path of the music file that is going to be
     * played.
     */
    public void setMusicPath(String path) { this.m_musicPath = path; }

    /**
     * This String variable is used to set the path of the music chosen by
     * the user in the main menu.
     */
    private String m_musicPath;

    /**
     * This is the method that the entire game runs from once
     * the "start button" button is pressed on the main menu, calling this method.
     * It initialises all the required objects (Model, Controller, View,
     * MusicPlayer) needed to make the game run and calls getMusicPlay to run
     * the music in the background of the game.
     *
     * @param theme
     * this variable is passed into model which is set to which theme for
     * the snake map that the user chose on the main menu.
     * @param musicChoice
     * contains the type of the music that the user selected on the main
     * menu.
     * @param snakeChoice
     * contains the type of snake that the user chose in the main
     * menu, passed into model to set which .png file from assets is used for
     * the snake.
     * @param scoreboard
     * this variable is an object of the class created "Scoreboard",
     * it is passed into Controller to allow the game to interact with the
     * scores.txt file and the scoreboard for the menu.
     */
    public void start(String theme, String musicChoice, String snakeChoice,
                      Scoreboard scoreboard, int levelChoice,
                      Integer multiplier)
            throws URISyntaxException {
        Model model = new Model(theme, snakeChoice, levelChoice, multiplier);
        Controller controller = new Controller(model, scoreboard);
        new View(controller);
        MusicPlayer mp = new MusicPlayer();
        mp.getMusicPlay(getFilename(musicChoice));
    }

    /**
     * This method takes a parameter of musicChoice which contains the type of
     * music the user would like playing as they play the game. This method
     * translates the type of music that the user would like into the path of
     * the file required to play that music and returns the path to its caller.
     * @param musicChoice
     * musicChoice is a String which contains the type of music that the user
     * wants playing in the background as they play the game.
     * @return
     * returns the path of the music file based on the musicChoice parameter
     * input containing the type of music the user wants.
     */
    public String getFilename(String musicChoice) {

        if(Objects.equals(musicChoice, "default")) {
            setMusicPath("/music/frogger.mp3");
        }
        if(Objects.equals(musicChoice, "ludicrous")) {
            setMusicPath("/music/ludicrous.mp3");
        }
        if(Objects.equals(musicChoice, "mediocre")) {
            setMusicPath("/music/mediocre.mp3");
        }
        if(Objects.equals(musicChoice, "relaxation")) {
            setMusicPath("/music/relaxation.mp3");
        }
        return getMusicPath();
    }
}
