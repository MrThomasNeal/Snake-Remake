package Menu.MC;

/**
 * This class is an object to represent a new score entry into the scores file.
 * @author Thomas Neal
 */
public class Scores {

    /**
     *
     * This method is a getter for the object's name.
     * @return
     * This method returns the object's name
     */
    public String getName() {
        return this.m_name;
    }

    /**
     * This method is a getter for the object's score.
     * @return
     * This method returns the object's score
     */
    public int getScore() {
        return this.m_score;
    }

    /**
     * This method is a setter for the variable containing the player's name.
     * @param name
     * This method returns the String variable containing the name of the player.
     */
    public void setName(String name) { this.m_name = name; }

    /**
     * This method is a setter for the variable containing the player's score.
     * @param score
     * this parameter takes in the new Integer value to set as the score.
     */
    public void setScore(int score) { this.m_score = score; }

    /**
     * this variable contains the name of the player who is currently playing.
     */
    private String m_name;

    /**
     * this variable contains the score of the player who is currently playing.
     */
    private int m_score;

    /**
     * This constructor takes in the new name and score of the player and sets
     * them to the objects name + score variables.
     * @param newName
     * this parameter takes in the new name to be set for the object to represent
     * the player's new score.
     * @param newScore
     * this parameter takes in the new score to beb set for the object to
     * represent the player's new score.
     */
    public Scores(String newName, int newScore) {
        setName(newName);
        setScore(newScore);
    }
}
