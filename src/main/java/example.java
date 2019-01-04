import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public  class example {



    public static void main(String args[]) {
        List<String> List = new ArrayList<String>();
//add string
        List.add("cricket");
        List.add("football");
        List.add("hockey");
        Iterator it = List.iterator();
        while(it.hasNext())
        {
            String s = (String) it.next();
        }
    }
}