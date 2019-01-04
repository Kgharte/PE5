import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapCountTest {

    MapCount mapCount = null;
    @Before
    public void setUp() throws Exception {
        mapCount = new MapCount();
    }

    @After
    public void tearDown() throws Exception {
        mapCount = null;
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void countOccurenceOne1() {
        String string= "one one -one___two,,three,one @three*one?two";
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",5);
        hashMap.put("two",2);
        hashMap.put("three",2);
        thrown.expect(NullPointerException.class);
        assertEquals(hashMap,mapCount.countWordOccurance(string));
    }
    @Test
    public void countOccurenceOne2() {
        String string= "one one -one___two,,three,one @three*one?two four";
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",5);
        hashMap.put("two",2);
        hashMap.put("three",2);
        hashMap.put("four",1);
        assertEquals(hashMap,mapCount.countWordOccurance(string));
    }

}