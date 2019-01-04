import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CharacterCountTest {

    CharacterCount characterCount;
    @Before
    public void setUp() throws Exception {
        characterCount = new CharacterCount();
    }

    @After
    public void tearDown() throws Exception {
        characterCount = null;
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void countCharacterOccurance1() throws Exception{
        String string[] ={"a","b","c","a","d","c","c"};
        HashMap<String,Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        assertEquals(expected,characterCount.countCharacterOccurance(string));

    }
    @Test
    public void countCharacterOccurance2() throws Exception{
        String string[] ={"a","b","a","a","a"};
        HashMap<String,Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        assertEquals(expected,characterCount.countCharacterOccurance(string));

    }
}