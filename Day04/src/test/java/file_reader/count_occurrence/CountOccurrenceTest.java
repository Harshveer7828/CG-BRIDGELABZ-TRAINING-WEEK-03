package file_reader.count_occurrence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountOccurrenceTest {

    // Test one
    @Test
    void countOccurrenceTestOne(){
        assertEquals(1, CountOccurrence.count("userFile.txt",'o'));
    }
}
