package Menu.MC;

import Game.MVC.Play;
import Game.util.GameUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

import static java.lang.Thread.sleep;
import static javafx.application.Platform.exit;

/**
 * This class is the controller for the main menu, it is responsible for
 * updating the view based on any actions carried out on the main menu.
 * @author Thomas Neal
 */
public class Controller {

    /**
     * This method is a getter for the welcome message text on the main menu.
     * @return
     * This method returns the text object that shows the welcome message on
     * the menu.
     */
    public Text getWelcomeMessage() { return this.m_welcomeMessage; }

    /**
     * This method is a getter for the scoreboard object that is used to
     * implement the high scores leaderboard feature.
     * @return
     * This method returns the scoreboard object.
     */
    public Scoreboard getScoreboard() { return this.m_scoreboard; }

    /**
     * This method is a getter for the String name variable, containing the
     * name of the current player.
     * @return
     * This method returns the name variable of the current player.
     */
    public String getName() { return this.m_name; }

    /**
     * This method is a getter for the String theme variable, containing the name
     * of the theme that the player has chosen to play with.
     * @return
     * This method returns the theme variable that contains the name of the
     * theme that the user has chosen.
     */
    public String getTheme() { return this.m_theme; }

    /**
     * This method is a getter for the String variable containing the music
     * type that the user chose on the main menu.
     * @return
     * This method returns the music name that the user chose on the main menu.
     */
    public String getMusicChoice() {return this.m_musicChoice; }

    /**
     * This method is a getter for the choice of snake that the user made
     * on the main menu.
     * @return
     * This method returns the type of snake chosen.
     */
    public String getSnakeChoice() { return this.m_snakeChoice; }

    /**
     * This method is a getter for the level that the user chose on the main
     * menu.
     * @return
     * This method returns the level that the user chose on the main menu.
     */
    public int getLevelChoice() { return this.m_levelChoice; }

    /**
     * This method is a getter for the score multiplier chosen by the user
     * on the main menu.
     * @return
     * This method returns the multiplier for the score.
     */
    public int getMultiplier() { return this.m_multiplier; }

    /**
     * This method is a getter for the sorted scores array used for the
     * leaderboard feature.
     * @return
     * This method returns the array of sorted scores in descending order.
     */
    public Scores[] getScoresArrayVariable() { return this.m_scoresArray; }

    /**
     * This method is a getter for the Text object on the main menu representing
     * first place.
     * @return
     * This method returns the Text object for first place.
     */
    public Text getLeaderboard1() { return this.m_leaderboard1; }

    /**
     * This method is a getter for the Text object on the main menu representing
     * second place.
     * @return
     * This method returns the Text object for second place.
     */
    public Text getLeaderboard2() { return this.m_leaderboard2; }

    /**
     * This method is a getter for the Text object on the main menu representing
     * third place.
     * @return
     * This method returns the Text object for third place.
     */
    public Text getLeaderboard3() { return this.m_leaderboard3; }

    /**
     * This method is a getter for the Text object on the main menu representing
     * fourth place.
     * @return
     * This method returns the Text object for fourth place.
     */
    public Text getLeaderboard4() { return this.m_leaderboard4; }

    /**
     * This method is a getter for the Text object on the main menu representing
     * fifth place.
     * @return
     * This method returns the Text object for fifth place.
     */
    public Text getLeaderboard5() { return this.m_leaderboard5; }

    /**
     * This method is a getter for the TextField of the "set custom background"
     * field which is used when the user wants to set their own custom
     * background.
     * @return
     * This method returns the TextField object for the custom background.
     */
    public TextField getCustomBackgroundField() {
        return this.m_customBackgroundField; }

    /**
     * This method is a getter for the Text object which displays an error
     * message when the file input from the user on the main menu is invalid.
     * @return
     * This method returns the Text object for the invalid file message.
     */
    public Text getInvalidFileMessage() { return this.m_invalidFileMessage; }

    /**
     * This method is a getter for the TextField object where the user inputs
     * their name and sets it.
     * @return
     * This method returns the nameEntry TextField object.
     */
    public TextField getNameEntry() { return this.m_nameEntry; }

    /**
     * This method is a getter for the TextField object where the user inputs
     * their chosen score multiplier for the game.
     * @return
     * This method returns the scoreMultiplierField TextField object
     */
    public TextField getScoreMultiplierField() {
        return this.m_scoreMultiplierField;
    }

    /**
     * This method is a getter for the Text field which displays an error
     * message when the user enters an invalid score multiplier.
     * @return
     * This method returns the Text object which displays an error message.
     */
    public Text getInvalidMultiplier() { return this.m_invalidMultiplier; }

    /**
     * This method is a getter for the GameUtil object which is used to get
     * images or check if an image exists.
     * @return
     * This method returns the GameUtil object.
     */
    public GameUtil getUtil() { return this.m_util; }

    /**
     * This method is a setter to set the music choice to "ludicrous".
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setLudicrous(ActionEvent event) {
        this.m_musicChoice = "ludicrous";
    }

    /**
     * This method is a setter to set the music choice to "mediocre".
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setMediocre(ActionEvent event) {
        this.m_musicChoice = "mediocre";
    }

    /**
     * This method is a setter to set the music choice to "relaxation".
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setRelaxation(ActionEvent event) {
        this.m_musicChoice = "relaxation";
    }

    /**
     * This method is a setter to set the snake choice to "default".
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setDefaultSnake(ActionEvent event) {
        this.m_snakeChoice = "default";
    }

    /**
     * This method is a setter to set the snake choice to "square".
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setSquareSnake(ActionEvent event) {
        this.m_snakeChoice = "square";
    }

    /**
     * This method is a setter for the theme of the game.
     * @param theme
     * this parameter takes in a String variable containing the name of theme
     * that the user has chosen on the main menu.
     */
    public void setTheme(String theme) { this.m_theme = theme; }

    /**
     * This method is a setter for the name of the player.
     * @param name
     * this parameter takes in a String variable containing the name of the
     * user currently playing.
     */
    public void setName(String name) { this.m_name = name; }

    /**
     * This method is a setter for the multiplier of the score.
     * @param multiplier
     * this parameter takes in the Integer value representing what the score
     * multiplier for the game is.
     */
    public void setMultiplier(Integer multiplier) {
        this.m_multiplier = multiplier;
    }

    /**
     * this variable contains the theme that the user wants to play on.
     */
    private String m_theme = "/assets/lighttheme.jpg";

    /**
     * this variable contains the type of music that the user wants to listen
     * to whilst playing the game.
     */
    private String m_musicChoice = "default";

    /**
     * this variable contains the type of snake that the user wants to play with.
     */
    private String m_snakeChoice = "default";

    /**
     * this variable contains the level that the user wants to play on.
     */
    private int m_levelChoice = 1;

    /**
     * this variable holds the String value typed into the name text field
     * on the main menu.
     */
    @FXML
    public TextField m_nameEntry;

    /**
     * this variable holds the String value typed into the background text field
     * on the main menu.
     */
    @FXML
    public TextField m_customBackgroundField;


    /**
     * this variable holds the String value typed into the multiplier text field
     * on the main menu.
     */
    @FXML
    public TextField m_scoreMultiplierField;

    /**
     * this variable contains the welcome message displayed on the main menu
     * when the user enters their username.
     */
    @FXML
    public Text m_welcomeMessage;

    /**
     * this variable is the Text field that displays the player in first place
     * on the leaderboard.
     */
    @FXML
    public Text m_leaderboard1;

    /**
     * this variable is the Text field that displays the player in second place
     * on the leaderboard.
     */
    @FXML
    public Text m_leaderboard2;

    /**
     * this variable is the Text field that displays the player in third place
     * on the leaderboard.
     */
    @FXML
    public Text m_leaderboard3;

    /**
     * this variable is the Text field that displays the player in fourth place
     * on the leaderboard.
     */
    @FXML
    public Text m_leaderboard4;

    /**
     * this variable is the Text field that displays the player in fifth place
     * on the leaderboard.
     */
    @FXML
    public Text m_leaderboard5;

    /**
     * this variable is the Text field that will be used to display an error
     * message to the user on the main menu when they input an incorrect
     * file name for the custom background.
     */
    @FXML
    public Text m_invalidFileMessage;

    /**
     *
     * this variable is the Text field that will be used to display an error
     * message to the user on the main menu when they input an invalid multiplier
     * or a multiplier that is out of the allowed bounds (1-100)
     */
    @FXML
    public Text m_invalidMultiplier;

    /**
     * this variable contains the name of the user
     */
    private String m_name;

    /**
     * this variable contains the Integer value that the score will be multiplied
     * by in the game.
     */
    private Integer m_multiplier = 1;

    /**
     * this variable contains the newly created scoreboard object which is used
     * to implement the high scores feature on the main menu.
     */
    private final Scoreboard m_scoreboard = new Scoreboard();

    /**
     * this variable contains an array of all the scores, sorted in
     * descending order.
     */
    private Scores[] m_scoresArray;

    /**
     * this variable is a container for the newly created GameUtil object
     * which is used for checking if a file exists or not.
     */
    private final GameUtil m_util = new GameUtil();

    /**
     * This method is called when the user clicks the "start game" button on
     * the main menu. It calls Play() which starts the game in a separate
     * window.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     * @throws URISyntaxException
     * thrown if the path is not a correct URI reference.
     */
    public void startGame(ActionEvent event) throws URISyntaxException {
        // pass in name
        if(getName() == null) {
            getWelcomeMessage().setText("You must enter a name");
        } else {
            getScoreboard().setName(getName());
            new Play().start(getTheme(), getMusicChoice(), getSnakeChoice(),
                    getScoreboard(), getLevelChoice(), getMultiplier());
        }
    }

    /**
     * Upon creating the Controller object, it will instantly call
     * getScoresArray() which gets the array of scores from the scoresfile
     * so that the high score leaderboard can be updated and displayed
     * accurately.
     * @throws IOException
     * throws exception if there's an error reading/writing from the scores file
     * @throws URISyntaxException
     * throws exception is the path to the file is of an invalid syntax.
     */
    public Controller() throws IOException, URISyntaxException {
        getScoresArray();
    }

    /** This method gets the sorted array which contains all the scores
     * in descending order for the leaderboard feature.
     * @throws IOException
     * exception thrown if there's an error reading/writing to one of the scores
     * files.
     */
    public void getScoresArray() throws IOException {
        this.m_scoresArray = m_scoreboard.getScoresArray();
    }

    /**
     * This method sets the leaderboard on the main menu up. When the menu
     * starts and the user moves their mouse, this method will be called, and
     * it will access the sorted scoresArray and put the scores into their
     * respective place on the leaderboard. Only the top 5 are displayed
     * on the menu.
     */
    public void setLeaderboard() {
        // 1ST PLACE
        try {
            getLeaderboard1().setText("1. " + getScoresArrayVariable()[0].
                    getName() + " - " + getScoresArrayVariable()[0].getScore());
        } catch (Exception e) {
            getLeaderboard1().setText("1. unknown");
        }

        // 2ND PLACE
        try {
            getLeaderboard2().setText("2. " + getScoresArrayVariable()[1].
                    getName() + " - " + getScoresArrayVariable()[1].getScore());
        } catch (Exception e) {
            getLeaderboard2().setText("2. unknown");
        }

        // 3RD PLACE
        try {
            getLeaderboard3().setText("3. " + getScoresArrayVariable()[2].
                    getName() + " - " + getScoresArrayVariable()[2].getScore());
        } catch (Exception e) {
            getLeaderboard3().setText("3. unknown");
        }

        // 4TH PLACE
        try {
            getLeaderboard4().setText("4. " + getScoresArrayVariable()[3].
                    getName() + " - " + getScoresArrayVariable()[3].getScore());
        } catch (Exception e) {
            getLeaderboard4().setText("4. unknown");
        }

        // 5TH PLACE
        try {
            getLeaderboard5().setText("5. " + getScoresArrayVariable()[4].
                    getName() + " - " + getScoresArrayVariable()[4].getScore());
        } catch (Exception e) {
            getLeaderboard5().setText("5. unknown");
        }

    }

    /**
     * This method closes the main menu when the "exit" button is clicked.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void closeWindow(ActionEvent event) {
        exit();
    }

    /**
     * This method is responsible for changing the theme of the game based
     * upon the user's selection in the main menu.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void changeTheme(ActionEvent event) {
        if(Objects.equals(getTheme(), "darktheme.jpg")) {
            setTheme("/assets/lighttheme.jpg");
        } else {
            setTheme("/assets/darktheme.jpg");
        }
    }

    /**
     * This method takes in a file name from the input box on the main menu.
     * Initially, it will check that that file exists by using the
     * ImageExistence method in GameUtil. If it exists it sets the theme as
     * that file path. If it doesn't exist, an error message is displayed to
     * the user.
     * @param e
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setCustomBackground(ActionEvent e) {
        String customBackground = getCustomBackgroundField().getText();
        String modelFilePath = "/assets/" + customBackground;
        boolean exist = getUtil().imageExistence(customBackground);
        if (exist) {
            setTheme(modelFilePath);
            getInvalidFileMessage().setText("");
        } else {
            getInvalidFileMessage().setText("Invalid file name!");
        }
    }

    /**
     * This method is a setter for the name of the user and when called, the
     * method sets the text on the main menu to include the user's name.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setName(ActionEvent event) {
        setName(getNameEntry().getText());
        if(Objects.equals(getName(), "")) {
            getWelcomeMessage().setText("You must enter a name");
        } else {
            getWelcomeMessage().setText("Welcome " + getName() + "!");
        }
    }

    /**
     * This method is called when the user clicks the "set" button next to the
     * multiplier text field. This method takes in the input in the text field
     * for the score multiplier and checks that its between 0-100. If it is,
     * the new score multiplier is set. If not, an error message is displayed
     * on the main menu.
     * @param e
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setMultiplier(ActionEvent e) {
        int scoreMultiplier = Integer.parseInt(getScoreMultiplierField().
                getText());
        if(scoreMultiplier > 0 && scoreMultiplier <= 100) {
            setMultiplier(scoreMultiplier);
            getInvalidMultiplier().setText("Current multiplier: " +
                    scoreMultiplier);
        } else {
            getInvalidMultiplier().setText("Multiplier must be between 1-100");
        }
    }

    /**
     * This method is called if the user chooses level 1 on the main menu.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setLevel1(ActionEvent event) { this.m_levelChoice = 1; }

    /**
     * This method is called if the user chooses level 2 on the main menu.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setLevel2(ActionEvent event) { this.m_levelChoice = 2;  }

    /**
     * This method is called if the user chooses level 3 on the main menu.
     * @param event
     * the event of the user clicking the button is passed into the method's
     * parameters.
     */
    public void setLevel3(ActionEvent event) { this.m_levelChoice = 3; }
}
