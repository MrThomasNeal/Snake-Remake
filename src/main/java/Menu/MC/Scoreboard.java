package Menu.MC;

import java.io.*;
import java.util.*;

/**
 * This class is responsible for functionality of the high scores feature within
 * the game.
 * @author Thomas Neal
 */
public class Scoreboard {

    /**
     * This method is a getter for the String variable containing the name
     * of the player.
     * @return
     * This method returns the name of the player.
     */
    public String getName() { return this.m_newName; }

    /**
     * This method is a getter for the String variable containing the score
     * of the player.
     * @return
     * This method returns the score of the player.
     */
    public String getScore() { return this.m_newScore; }

    /**
     * This method is a getter for the String variable containing the filename
     * of the scores file.
     * @return
     * This method returns the variable containing the name of the scores file.
     */
    public String getFilename() { return "scores.txt"; }

    /**
     * This method is a setter for the name of the new entry into the scores
     * file.
     * @param name
     * the parameter name takes in the new name for the new entry into the
     * scores file.
     */
    public void setName(String name) { this.m_newName = name; }

    /**
     * This method is a setter for the score of the new entry into the scores
     * file.
     * @param score
     * the parameter score takes in the new score for the new entry into the
     * scores file.
     */
    public void setScore(String score) { this.m_newScore = score; }

    /**
     * this variable contains the name for the new entry into the scores file.
     */
    private String m_newName;

    /**
     * this variable contains the score for the new entry in the scores file.
     */
    private String m_newScore;

    /**
     * This constructor calls the createScoresFiles function which creates
     * the needed scores files if they do not already exist.
     */
    public Scoreboard() throws IOException {
        createScoresFiles();
    }

    /**
     * This method is used to create the needed scores files incase they
     * haven't been created yet (first time running the program)
     * @throws IOException
     * throws exception if there is a problem reading/writing from the file.
     */
    public boolean createScoresFiles() throws IOException {
        File scores = new File("scores.txt");
        boolean fileCreated;
        boolean sortedFileCreated;
        fileCreated = scores.createNewFile();
        File sortedScores = new File("sortedScore.txt");
        sortedFileCreated = sortedScores.createNewFile();
        return fileCreated && sortedFileCreated;
    }
    /**
     * This method is responsible for writing the new score entry into the
     * scores file by creating a String value using the new name and new score
     * to create a key:value pair to write into the scores file.
     * @throws IOException
     * exception is thrown if there is an error writing to the scores file.
     */
    public void newEntry() throws IOException {
        String newEntry = getName() + ":" + getScore() + "\n";
        BufferedWriter writer = new BufferedWriter(new FileWriter(getFilename(),
                true));
        writer.write(newEntry);
        writer.close();
    }

    /**
     * This method is responsible for accessing the unsorted scores file and
     * putting all the entries into an array. This array is then sorted to put
     * the score key:value pairs into descending order.
     * @return
     * This method returns the sorted array of scores.
     * @throws IOException
     * this exception is thrown is there is a problem reading/writing to the
     * file.
     */
    public Scores[] getScoresArray() throws IOException {
        int length = getFileLength();
        Scores[] scoresArray = new Scores[length];
        int x = 0;
        BufferedReader reader =
                new BufferedReader(new FileReader(getFilename()));
        for (int i = 0; i < length; i++) {
            String line = reader.readLine();
            String[] parts = line.split(":");
            Scores score = new Scores(parts[0], Integer.parseInt(parts[1]));
            scoresArray[x] = score;
            x++;
        }
        Arrays.sort(scoresArray, Comparator.comparing(Scores::getScore).
                reversed());
        return scoresArray;
    }

    /**
     * This method is responsible for taking the sorted array of scores that
     * comes from getScoresArray() and putting them back into the sortedScores
     * file.
     * @throws IOException
     * this exception is thrown if there is a problem reading/writing to the
     * scores files.
     */
    public void sortFile() throws IOException {
        int length = getFileLength();
        Scores[] scoresArray = getScoresArray();
        String sortedFilename = "sortedScore.txt";
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(sortedFilename, false));
        for(int i = 0; i < length; i++) {
            writer.write(scoresArray[i].getName() + ":" +
                    scoresArray[i].getScore() + "\n");
        }
        writer.close();
    }

    /**
     * This method returns the size of the scores file when called.
     * @return
     * This method returns the size of the scores file when called.
     * @throws IOException
     * exception is thrown if there is a problem with reading from the scores
     * file.
     */
    private int getFileLength() throws IOException {
        int size = 0;
        BufferedReader reader = new BufferedReader(new FileReader(getFilename()));
        while(reader.readLine() != null) {
            size++;
        }
        reader.close();
        return size;
    }
}
