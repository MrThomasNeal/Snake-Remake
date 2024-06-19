package Game.util;

import java.util.Arrays;

/**
 * This class is responsible for the file implementation.
 * @author Thomas Neal
 */
public class FileImplementation implements FileContainer {

    /**
     * This method is a getter for the file iterator object.
     * @return
     * This method returns the file iterator object.
     */
    @Override
    public FileIterator getFileIterator() {
        return new IterateImages();
    }

    /**
     * This method is a getter for the filenames array.
     * @return
     * This method returns the filenames array.
     */
    public String[] getFileNames() { return this.m_fileNames; }

    /**
     * This method is a setter for the filenames array.
     * @param filenames
     * this parameter takes in the filenames array that is going to be set.
     */
    public void setFilenames(String[] filenames) {this.m_fileNames = filenames;}

    /**
     * This String array contains the names of the file names that need to be
     * accessed.
     */
    private String[] m_fileNames;

    /**
     * This is the class' constructor.
     * @param fileNames
     * this parameter takes in the filenames to be set in the class for use.
     */
    public FileImplementation(String[] fileNames) {
        setFilenames(fileNames);
    }

    /**
     * This class is responsible for the functionality of the iterator that will
     * iterate through the scores file.
     */
    private class IterateImages implements FileIterator {

        /**
         * This method is a getter for the index used in the m_value method.
         * @return
         * This method returns the Integer value representing the index.
         */
        public Integer getIndex() { return this.m_index; }

        /**
         * this variable contains the index to show how many images have been
         * added to the ImageUtil HashMap of images that are used throughout
         * the game.
         */
        int m_index = 0;

        /**
         * This method checks to see if there is any more file names that need
         * to be added to the HashMap.
         * @return
         * This method returns true or false depending on whether there are
         * any file names that need to be added to the HashMap.
         */
        @Override
        public boolean m_empty() {
            return getIndex() < getFileNames().length;
        }

        /**
         * This method returns the file name stored at the current index in
         * ImageUtil's HashMap.
         * @return
         * This method returns the file name is there are still more filenames
         * to iterate through. Returns null when there are no more file names
         * to process.
         */
        @Override
        public String m_value() {
            if(m_empty()) {
                return getFileNames()[m_index++];
            }
            return null;
        }
    }
}
