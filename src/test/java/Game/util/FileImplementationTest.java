package Game.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class FileImplementationTest {

    String[] fileArray = {"test1", "test2", "test3"};
    FileImplementation fi = new FileImplementation(fileArray);

    @Test
    @DisplayName("Filename setter and getters")
    void testFilenameSetterAndGetter() {
        fi.setFilenames(fileArray);
        String[] getter = fi.getFileNames();
        if(Objects.equals(getter[0], "test1")) {
            if(Objects.equals(getter[1], "test2"))  {
                 if(Objects.equals(getter[2], "test3")) {
                     assertTrue(true);
                 } else {
                     fail();
                }
            } else {
                fail();
            }
        } else {
            fail();
        }
    }

}