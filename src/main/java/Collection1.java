import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Collection1
{
    public List<String> arrayListCollection(List<String> str)
    {

        List<String> str1 = new ArrayList<String>(str);
        System.out.println(str1);
        str1.set(0,"Kiwi");
        str1.set(2,"Mango");
        return str1;
    }
    public List<String> emptyArrayCollection(List<String> str2)
    {
        List<String> str3 = new ArrayList<String>(str2);

        System.out.println(str3);
        str3.removeAll(str3);
        System.out.println(str3);
        return str3;
    }

}
