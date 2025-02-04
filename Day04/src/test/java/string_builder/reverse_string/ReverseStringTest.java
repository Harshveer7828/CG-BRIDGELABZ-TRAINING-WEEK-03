package string_builder.reverse_string;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


// Checks the test using assertions
public class ReverseStringTest {
    @Test
    void reverse1(){
        assertEquals("hsraH",ReverseString.reverse("Harsh"));
    }
    @Test
    void reverse2(){
        assertEquals("Om Tiwari",ReverseString.reverse("irawiT mO"));
    }
    @Test
    void reverse3(){
        assertEquals("LPA LPA",ReverseString.reverse("APL APL"));
    }

}
