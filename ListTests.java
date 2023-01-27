import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests{

    @Test
    public void testFilterCaps(){

        ListExamples sc = new ListExamples();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "Apple", "gel", "cut"));

        assertEquals(new ArrayList<String>(Arrays.asList("Apple", "gel", "cut")), ListExamples.filter(list, sc));

    }

}