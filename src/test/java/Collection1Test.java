import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Collection1Test {

    Collection1 collection1;
    @Before
    public void setUp() throws Exception {
        collection1 = new Collection1();
    }

    @After
    public void tearDown() throws Exception {
        collection1 =null;
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void arrayListCollection1() throws Exception {
        List<String> actual = Arrays.asList("Apple","Grape","Melon","Berry");
        List<String> expected = Arrays.asList("Kiwi", "Grape", "Mango","Berry");
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(expected,collection1.arrayListCollection(actual));
    }
    @Test
    public void arrayListCollection2() throws Exception {
        List<String> actual = Arrays.asList("Apple","Grape","Melon","Berry");
        List<String> expected=new ArrayList<String>();
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(expected,collection1.emptyArrayCollection(actual));
    }
}