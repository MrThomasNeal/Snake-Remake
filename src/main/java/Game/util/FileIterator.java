package Game.util;

/**
 * This class is an interface for the iterator design process.
 * @author Thomas Neal
 */
public interface FileIterator {

    /**
     * This variable contains true or false depending on whether there are any
     * more file names to process.
     * @return
     */
    boolean m_empty();

    /**
     * This variable contains the String value of the file name at the specific
     * index within the FileImplementation class.
     * @return
     */
    String m_value();
}
