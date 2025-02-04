package string_buffer.concatenate_string;
import string_buffer.concatenate_string.ConcatenateString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ConcatenateStringTest {
    // Test One
    @Test
    void concatenateStringTest1(){
        assertEquals("Harshveersinghthakur", ConcatenateString.concatenate(new String[]{"Harsh","veer","singh","thakur"}));
    }

    // Test second
    @Test
    void concatenateStringTest2(){
        assertEquals("JhonDoe", ConcatenateString.concatenate(new String[]{"Jhon","Doe"}));
    }

    // Test third
    @Test
    void concatenateStringTest3(){
        assertEquals("Omtiwari", ConcatenateString.concatenate(new String[]{"Om","tiwari"}));
    }



}
