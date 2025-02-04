package string_builder.remove_duplicates_from_string;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RemoveDuplicateTest {

    // Test one
    @Test
    void removeDuplicatesTest1(){
        assertEquals("harsveing",RemoveDuplicates.deleteDuplicates("harshveersingh"));
    }

    // Test second
    @Test
    void removeDuplicatesTest2(){
        assertEquals("abcdef",RemoveDuplicates.deleteDuplicates("aabbccddeef"));
    }
    // Test third
    @Test
    void removeDuplicatesTest3(){
        assertEquals("aeiou",RemoveDuplicates.deleteDuplicates("aaaeeeiiioouuu"));
    }
}
