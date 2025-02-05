package linear_search.word_search;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchWordTest {
    // Test one
    @Test
    void searchWordTestOne(){
        assertEquals("12", SearchWord.search(new String[] {"45","3","4","6","12"},"1"));
    }

}
