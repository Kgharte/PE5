import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapReplaceValueTest {

    MapReplaceValue mapReplaceValue;
    @Before
    public void setUp() throws Exception {
        mapReplaceValue = new MapReplaceValue();
    }

    @After
    public void tearDown() throws Exception {
        mapReplaceValue = null;
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void replaceValue1() {
        Map<String,String> map = new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");


        Map<String,String> map1 = new HashMap<>();
        map1.put("val1"," ");
        map1.put("val2","java");
        thrown.expect(NullPointerException.class);
        assertEquals(map1,mapReplaceValue.replaceValue(map));
    }
}