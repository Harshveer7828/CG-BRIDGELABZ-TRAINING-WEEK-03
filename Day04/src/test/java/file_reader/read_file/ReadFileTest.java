package file_reader.read_file;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ReadFileTest {

    // Test one
    @Test
    void ReadFileTestOne(){
        assertEquals("src/main/java/file_reader/read_file/userFile.txt",ReadFile.readFile("userFile.txt"));
    }

    // Test second produce error as the incorrect path of the file and not found exception
    @Test
    void ReadFileTestSecond(){
        assertEquals("src/main/java/read_file/userFile.txt",ReadFile.readFile("userFile.txt"));
    }

}
