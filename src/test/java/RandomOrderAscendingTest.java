import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;

import static org.junit.Assert.*;

public class RandomOrderAscendingTest {


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ascedingOrder1() throws Exception
    {
        List<String> ip=new ArrayList<String>(Arrays.asList("Harry","Olive","Alice","Bluto","Eugine"));
        TreeSet<String> op=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(op,new RandomOrderAscending().ascendingOrder(ip));
    }

    @Test
    public void ascedingOrder2() throws Exception
    {
        TreeSet<String> ip=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        List<String> op=new ArrayList<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(op,new RandomOrderAscending().convertList(ip));

    }
}